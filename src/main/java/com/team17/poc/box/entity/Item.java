// 제품명,사진 경로, 유통기한, 알림 여부, 등록날짜, 장소 연관관계 등 저장함.
package com.team17.poc.box.entity;

import com.team17.poc.auth.entity.Member;
import com.team17.poc.box.dto.ItemRequestDto;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;            // 제품 이름
    private String imageUrl;       // 사진 경로
    private LocalDate registerDate; // 등록일
    private LocalDate expireDate;   // 유통기한
    private boolean alarmEnabled;   // 알림 여부

    // 🔗 장소: 다대일 (하나의 장소에 여러 제품이 있을 수 있음)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private Location location;

    // 🔗 사용자 정보 (로그인 유저 식별용)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    // 아이템 업데이트 관련
    public void updateFromDto(ItemRequestDto dto, Location location, Member member) {
        this.name = dto.getName();
        this.imageUrl = dto.getImageUrl();
        this.registerDate = dto.getRegisterDate(); // 필드명이 shotDate여도 DTO는 registerDate
        this.expireDate = dto.getExpireDate();
        this.alarmEnabled = dto.isAlarmEnabled();
        this.location = location;
        this.member = member;
    }

}

