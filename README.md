# Keepbara (키피바라) - Backend

**2025 유니톤 본선진출 프로젝트**  

**"유통기한 기반 식품 나눔 플랫폼"**  
키피바라는 남은 식재료를 쉽게 관리하고, 필요한 사람들과 나눌 수 있는 **유통기한 관리 + 거래 서비스**입니다.

이 저장소는 **Spring Boot 기반의 키피바라 백엔드 API 서버**입니다.

발표자료 : https://keepbara.my.canva.site/

---

## 🔧 기술 스택

- **Spring Boot 3.1**
- **Spring Security + 세션 인증**
- **JPA (Hibernate) + MariaDB**
- **AWS EC2 + Nginx + HTTPS 배포**
- **OCR / 바코드 인식 연동**

---

## ⚙️ 주요 기능

| 기능 구분        | 설명 |
|----------------|------|
| 🔐 회원가입/로그인  | 로컬 계정 + Google/Kakao 소셜 로그인 지원 |
| 📦 창고 기능       | OCR/바코드로 유통기한/상품명 인식 후 창고에 등록 |
| 🔄 상품 거래       | 유통기한 임박 상품 등록 → 오픈채팅 URL로 공유 |
| 🖼️ 이미지 업로드  | 상품 사진 최대 5장 등록 가능  |

---

## 🧱 패키지 구조

```

com.team17.keepibara
├── auth          # 로그인/회원가입, JWT 처리
├── barcode       # 바코드 인식 처리
├── ocr           # OCR 인식 처리
├── products       # 거래 관련 기능
├── box       # 창고 기능 (보관함)
└── config        # Spring Security, Web 설정

```

---

## 📦 API 명세

[회원]
![image](https://github.com/user-attachments/assets/7bf5368b-d677-4685-a324-ada5222ef117)

[창고 ( 유통기한 관리 ) ]
![image](https://github.com/user-attachments/assets/4edc725d-e223-486a-a9df-71cb8f977ce6)

[상품 (거래)]
![image](https://github.com/user-attachments/assets/85782747-ade7-42ab-8ecf-451a72e0039d)

[마이페이지]
![image](https://github.com/user-attachments/assets/dc83e60c-d1ee-4fe2-a42c-a1b43481282e)

---

## 🚀 배포 환경

- **AWS EC2 (Ubuntu 22.04)**  
- **Nginx + Let's Encrypt(HTTPS)**  
- GitHub Actions 통한 CI/CD 구성 (예정)

---

## 🙋‍♂️ 담당 역할

> 해당 백엔드 프로젝트는 팀 프로젝트로 진행되었으며,  
본인은 다음을 담당하였습니다:

- 전체 API 설계 및 구현
- 세션 기반 인증 구현
- 거래 기능 백엔드 로직 개발
- EC2 서버 세팅 + HTTPS + 배포

---


## 👥 팀원

| 이름     | 역할             |
|----------|------------------|
| 김재웅   | 백엔드: 바코드, 거래, 인증 |
| 안재일   | 백엔드: OCR, 창고, 마이페이지 |
| 임은지   | 프론트엔드, UI 디자인 (Figma), |
| 박희찬   | 프론트엔드, 사용자 흐름 설계, 디자인|

---

## 📮 문의

- Contact: bugs0613@naver.com
```
