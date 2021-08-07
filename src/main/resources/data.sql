-- 상위 카테고리
INSERT INTO product_category (name, status, ord, deleted_yn, created_at, updated_at) VALUES
    ('상의', 'ACTIVE', 1, false, now(), now()),
    ('아우터', 'ACTIVE', 2, false, now(), now()),
    ('바지', 'ACTIVE', 3, false, now(), now()),
    ('원피스', 'ACTIVE', 4, false, now(), now()),
    ('스커트', 'ACTIVE', 5, false, now(), now()),
    ('스니커즈', 'ACTIVE', 6, false, now(), now()),
    ('신발', 'ACTIVE', 7, false, now(), now()),
    ('가방', 'ACTIVE', 8, false, now(), now()),
    ('여성 가방', 'ACTIVE', 9, false, now(), now()),
    ('스포츠/용품', 'ACTIVE', 10, false, now(), now()),
    ('골프용품', 'ACTIVE', 11, false, now(), now()),
    ('모자', 'ACTIVE', 12, false, now(), now()),
    ('양말/레그웨어', 'ACTIVE', 13, false, now(), now()),
    ('속옷', 'ACTIVE', 14, false, now(), now()),
    ('선글라스/안경테', 'ACTIVE', 15, false, now(), now()),
    ('액세서리', 'ACTIVE', 16, false, now(), now()),
    ('시계', 'ACTIVE', 17, false, now(), now()),
    ('주얼리', 'ACTIVE', 18, false, now(), now()),
    ('뷰티', 'ACTIVE', 19, false, now(), now()),
    ('디지털/테크', 'ACTIVE', 20, false, now(), now()),
    ('생활/취미/예술', 'ACTIVE', 21, false, now(), now()),
    ('책/음악/티켓', 'ACTIVE', 22, false, now(), now()),
    ('반려동물', 'ACTIVE', 23, false, now(), now());

-- 하위 카테고리
-- 상의
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (1, '반팔 티셔츠', 'ACTIVE', 1, false, now(), now()),
    (1, '긴팔 티셔츠', 'ACTIVE', 2, false, now(), now()),
    (1, '민소매 티셔츠', 'ACTIVE', 3, false, now(), now()),
    (1, '셔츠/블라우스', 'ACTIVE', 4, false, now(), now()),
    (1, '피케/카라 티셔츠', 'ACTIVE', 5, false, now(), now()),
    (1, '맨투맨/스웨트셔츠', 'ACTIVE', 6, false, now(), now()),
    (1, '후드 티셔츠', 'ACTIVE', 7, false, now(), now()),
    (1, '니트/스웨터', 'ACTIVE', 8, false, now(), now()),
    (1, '기타 상의', 'ACTIVE', 9, false, now(), now());

-- 아우터
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (2, '후드 집업', 'ACTIVE', 1, false, now(), now()),
    (2, '블루종/MA-1', 'ACTIVE', 2, false, now(), now()),
    (2, '레더/라이더스 재킷', 'ACTIVE', 3, false, now(), now()),
    (2, '무스탕/퍼', 'ACTIVE', 4, false, now(), now()),
    (2, '트러커 재킷', 'ACTIVE', 5, false, now(), now()),
    (2, '슈트/블레이저 재킷', 'ACTIVE', 6, false, now(), now()),
    (2, '카디건', 'ACTIVE', 7, false, now(), now()),
    (2, '아노락 재킷', 'ACTIVE', 8, false, now(), now()),
    (2, '플리스/뽀글이', 'ACTIVE', 9, false, now(), now()),
    (2, '트레이닝 재킷', 'ACTIVE', 10, false, now(), now()),
    (2, '스타디움 재킷', 'ACTIVE', 11, false, now(), now()),
    (2, '환절기 코트', 'ACTIVE', 12, false, now(), now()),
    (2, '겨울 싱글 코트', 'ACTIVE', 13, false, now(), now()),
    (2, '겨울 더블 코드', 'ACTIVE', 14, false, now(), now()),
    (2, '겨울 기타 코트', 'ACTIVE', 15, false, now(), now()),
    (2, '롱패딩/롱헤비 아우터', 'ACTIVE', 16, false, now(), now()),
    (2, '숏패딩/숏헤비 아우터', 'ACTIVE', 17, false, now(), now()),
    (2, '패딩 베스트', 'ACTIVE', 18, false, now(), now()),
    (2, '베스트', 'ACTIVE', 19, false, now(), now()),
    (2, '사파리/헌팅 재킷', 'ACTIVE', 20, false, now(), now()),
    (2, '나일론/코치 재킷', 'ACTIVE', 21, false, now(), now()),
    (2, '기타 아우터', 'ACTIVE', 22, false, now(), now());

-- 바지
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (3, '데님 팬츠', 'ACTIVE', 1, false, now(), now()),
    (3, '코튼 팬츠', 'ACTIVE', 2, false, now(), now()),
    (3, '슈트 팬츠/슬랙스', 'ACTIVE', 3, false, now(), now()),
    (3, '트레이닝/조거 팬츠', 'ACTIVE', 4, false, now(), now()),
    (3, '숏 팬츠', 'ACTIVE', 5, false, now(), now()),
    (3, '레깅스', 'ACTIVE', 6, false, now(), now()),
    (3, '점프 슈트/어버올', 'ACTIVE', 7, false, now(), now()),
    (3, '기타 바지', 'ACTIVE', 8, false, now(), now());

-- 원피스
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (4, '미니 원피스', 'ACTIVE', 1, false, now(), now()),
    (4, '미디 원피스', 'ACTIVE', 2, false, now(), now()),
    (4, '맥시 원피스', 'ACTIVE', 3, false, now(), now());

-- 스커트
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (5, '미니스커트', 'ACTIVE', 1, false, now(), now()),
    (5, '미디스커트', 'ACTIVE', 2, false, now(), now()),
    (5, '롱스커트', 'ACTIVE', 3, false, now(), now());

-- 스니커스
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (6, '캔버스/단화', 'ACTIVE', 1, false, now(), now()),
    (6, '러닝화/피트니스화', 'ACTIVE', 2, false, now(), now()),
    (6, '농구화', 'ACTIVE', 3, false, now(), now()),
    (6, '기타 스니커즈', 'ACTIVE', 4, false, now(), now());

-- 신발
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (7, '구두', 'ACTIVE', 1, false, now(), now()),
    (7, '로퍼', 'ACTIVE', 2, false, now(), now()),
    (7, '힐/펌프스', 'ACTIVE', 3, false, now(), now()),
    (7, '플랫 슈즈', 'ACTIVE', 4, false, now(), now()),
    (7, '블로퍼', 'ACTIVE', 5, false, now(), now()),
    (7, '샌들', 'ACTIVE', 6, false, now(), now()),
    (7, '슬리퍼', 'ACTIVE', 7, false, now(), now()),
    (7, '기타 신발', 'ACTIVE', 8, false, now(), now()),
    (7, '모카신/보트 슈즈', 'ACTIVE', 9, false, now(), now()),
    (7, '부츠', 'ACTIVE', 10, false, now(), now()),
    (7, '신발 용품', 'ACTIVE', 11, false, now(), now());

-- 가방
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (8, '백팩', 'ACTIVE', 1, false, now(), now()),
    (8, '메신저/크로스 백', 'ACTIVE', 2, false, now(), now()),
    (8, '숄더백', 'ACTIVE', 3, false, now(), now()),
    (8, '토트백', 'ACTIVE', 4, false, now(), now()),
    (8, '에코백', 'ACTIVE', 5, false, now(), now()),
    (8, '보스턴/드럼/더블백', 'ACTIVE', 6, false, now(), now()),
    (8, '웨이스트 백', 'ACTIVE', 7, false, now(), now()),
    (8, '파우치 백', 'ACTIVE', 8, false, now(), now()),
    (8, '브리프케이스', 'ACTIVE', 9, false, now(), now()),
    (8, '케리어', 'ACTIVE', 10, false, now(), now()),
    (8, '가방 소품', 'ACTIVE', 11, false, now(), now()),
    (8, '지갑/머니클립', 'ACTIVE', 12, false, now(), now()),
    (8, '클러치 백', 'ACTIVE', 13, false, now(), now());

-- 여성 가방
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (9, '크로스백', 'ACTIVE', 1, false, now(), now()),
    (9, '토트백', 'ACTIVE', 2, false, now(), now()),
    (9, '숄더백', 'ACTIVE', 3, false, now(), now()),
    (9, '클러치 백', 'ACTIVE', 4, false, now(), now()),
    (9, '파우치 백', 'ACTIVE', 5, false, now(), now()),
    (9, '백팩', 'ACTIVE', 6, false, now(), now()),
    (9, '웨이스트 백', 'ACTIVE', 7, false, now(), now()),
    (9, '지갑/머니클립', 'ACTIVE', 8, false, now(), now()),
    (9, '가방 소품', 'ACTIVE', 9, false, now(), now());

-- 스포츠/용품
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (10, '기능성 상의', 'ACTIVE', 1, false, now(), now()),
    (10, '기능성 하의', 'ACTIVE', 2, false, now(), now()),
    (10, '수영복/래쉬가드', 'ACTIVE', 3, false, now(), now()),
    (10, '수영 용품', 'ACTIVE', 4, false, now(), now()),
    (10, '캠핑 용품', 'ACTIVE', 5, false, now(), now()),
    (10, '스케이트 용품', 'ACTIVE', 6, false, now(), now()),
    (10, '자전거 용품', 'ACTIVE', 7, false, now(), now()),
    (10, '스노우 웨어', 'ACTIVE', 8, false, now(), now()),
    (10, '스노우 용품', 'ACTIVE', 9, false, now(), now()),
    (10, '기타 스포츠', 'ACTIVE', 10, false, now(), now());

-- 골프용품
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (11, '골프 잡화', 'ACTIVE', 1, false, now(), now()),
    (11, '골프 모자', 'ACTIVE', 2, false, now(), now()),
    (11, '골프화', 'ACTIVE', 3, false, now(), now()),
    (11, '골프 가방', 'ACTIVE', 4, false, now(), now()),
    (11, '골프 클럽', 'ACTIVE', 5, false, now(), now()),
    (11, '골프공', 'ACTIVE', 6, false, now(), now()),
    (11, '클럽 커버', 'ACTIVE', 7, false, now(), now()),
    (11, '볼마커', 'ACTIVE', 8, false, now(), now()),
    (11, '골프티', 'ACTIVE', 9, false, now(), now()),
    (11, '기타 필드용품', 'ACTIVE', 10, false, now(), now()),
    (11, '기타 골프용품', 'ACTIVE', 11, false, now(), now());

-- 모자
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (12, '캡/야구 모자', 'ACTIVE', 1, false, now(), now()),
    (12, '헌팅캡/베레모', 'ACTIVE', 2, false, now(), now()),
    (12, '페도라', 'ACTIVE', 3, false, now(), now()),
    (12, '버킷/사파리햇', 'ACTIVE', 4, false, now(), now()),
    (12, '비니', 'ACTIVE', 5, false, now(), now()),
    (12, '트루퍼', 'ACTIVE', 6, false, now(), now()),
    (12, '기타 모자', 'ACTIVE', 7, false, now(), now());

-- 양말/레그웨어
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (13, '양말', 'ACTIVE', 1, false, now(), now()),
    (13, '스타킹', 'ACTIVE', 2, false, now(), now());

-- 속옷
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (14, '여성 속옷 상의', 'ACTIVE', 1, false, now(), now()),
    (14, '여성 속옷 하의', 'ACTIVE', 2, false, now(), now()),
    (14, '여성 속옷 세트', 'ACTIVE', 3, false, now(), now()),
    (14, '남성 속옷', 'ACTIVE', 4, false, now(), now()),
    (14, '홈웨어', 'ACTIVE', 5, false, now(), now());

-- 선글라스/안경테
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (15, '안경', 'ACTIVE', 1, false, now(), now()),
    (15, '선글라스', 'ACTIVE', 2, false, now(), now()),
    (15, '안경 소품', 'ACTIVE', 3, false, now(), now());

-- 액세서리
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (16, '마스크', 'ACTIVE', 1, false, now(), now()),
    (16, '키링/키케이스', 'ACTIVE', 2, false, now(), now()),
    (16, '벨트', 'ACTIVE', 3, false, now(), now()),
    (16, '넥타이', 'ACTIVE', 4, false, now(), now()),
    (16, '머플러', 'ACTIVE', 5, false, now(), now()),
    (16, '스카프/반다나', 'ACTIVE', 6, false, now(), now()),
    (16, '장갑', 'ACTIVE', 7, false, now(), now()),
    (16, '기타 액세서리', 'ACTIVE', 8, false, now(), now());

-- 시계
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (17, '디지털', 'ACTIVE', 1, false, now(), now()),
    (17, '쿼츠 아날로그', 'ACTIVE', 2, false, now(), now()),
    (17, '오토매틱 아날로그', 'ACTIVE', 3, false, now(), now()),
    (17, '시계 용품', 'ACTIVE', 4, false, now(), now()),
    (17, '기타 시계', 'ACTIVE', 5, false, now(), now());

-- 주얼리
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (18, '팔찌', 'ACTIVE', 1, false, now(), now()),
    (18, '반지', 'ACTIVE', 2, false, now(), now()),
    (18, '목걸이/팬던트', 'ACTIVE', 3, false, now(), now()),
    (18, '귀걸이', 'ACTIVE', 4, false, now(), now()),
    (18, '발찌', 'ACTIVE', 5, false, now(), now()),
    (18, '브로치/배지', 'ACTIVE', 6, false, now(), now()),
    (18, '헤어 액세서리', 'ACTIVE', 7, false, now(), now());

-- 뷰티
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (19, '스킨케어', 'ACTIVE', 1, false, now(), now()),
    (19, '베이스 메이크업', 'ACTIVE', 2, false, now(), now()),
    (19, '포인트 메이크업', 'ACTIVE', 3, false, now(), now()),
    (19, '헤어케어', 'ACTIVE', 4, false, now(), now()),
    (19, '바디케어', 'ACTIVE', 5, false, now(), now()),
    (19, '쉐이빙/제모', 'ACTIVE', 6, false, now(), now()),
    (19, '클렌징', 'ACTIVE', 7, false, now(), now()),
    (19, '뷰티 디바이스', 'ACTIVE', 8, false, now(), now()),
    (19, '향수/탈취', 'ACTIVE', 9, false, now(), now()),
    (19, '다이어트/헬스', 'ACTIVE', 10, false, now(), now()),
    (19, '미용 소품', 'ACTIVE', 11, false, now(), now()),
    (19, '덴탈케어', 'ACTIVE', 12, false, now(), now());

-- 디지털/테크
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (20, '이어폰', 'ACTIVE', 1, false, now(), now()),
    (20, '헤드폰', 'ACTIVE', 2, false, now(), now()),
    (20, '스피커', 'ACTIVE', 3, false, now(), now()),
    (20, '케이스/슬리브', 'ACTIVE', 4, false, now(), now()),
    (20, '충전기/케이블', 'ACTIVE', 5, false, now(), now()),
    (20, '거치대', 'ACTIVE', 6, false, now(), now()),
    (20, '카메라/카메라용품', 'ACTIVE', 7, false, now(), now()),
    (20, '기타 디지털/테크', 'ACTIVE', 8, false, now(), now());

-- 생활/취미/예술
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (21, '우산', 'ACTIVE', 1, false, now(), now()),
    (21, '가구/조명', 'ACTIVE', 2, false, now(), now()),
    (21, '침구/쿠션/담요', 'ACTIVE', 3, false, now(), now()),
    (21, '러그/매트/수건', 'ACTIVE', 4, false, now(), now()),
    (21, '디퓨저/캔들', 'ACTIVE', 5, false, now(), now()),
    (21, '액자/포스터', 'ACTIVE', 6, false, now(), now()),
    (21, '키친', 'ACTIVE', 7, false, now(), now()),
    (21, '텀블러', 'ACTIVE', 8, false, now(), now()),
    (21, '문구', 'ACTIVE', 9, false, now(), now()),
    (21, '토이', 'ACTIVE', 10, false, now(), now()),
    (21, '기타 라이프', 'ACTIVE', 11, false, now(), now());

-- 책/음악/티켓
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (22, '잡지/무크지', 'ACTIVE', 1, false, now(), now()),
    (22, '기타 컬쳐', 'ACTIVE', 2, false, now(), now());

-- 반려동물
INSERT INTO product_category (parent_category_id, name, status, ord, deleted_yn, created_at, updated_at) VALUES
    (23, '반려동물 의류', 'ACTIVE', 1, false, now(), now()),
    (23, '반려동물 용품', 'ACTIVE', 2, false, now(), now());