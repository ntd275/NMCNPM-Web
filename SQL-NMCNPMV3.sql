CREATE DATABASE NMCNPMV3;
use NMCNPMV3;
create TABLE KhachHang(
    IDKH char(4) not NULL,
    TenDangNhap VARCHAR(30) not NULL,
    MatKhau VARCHAR(50) not NULL,
    TenKH NVARCHAR(30) not NULL,
    SoDT NVARCHAR(10),
    Email VARCHAR(30),
    DiaChi NVARCHAR(100) not NULL,
    CONSTRAINT KhoaChinhKH PRIMARY KEY(IDKH),
 );

Use NMCNPMV2;
INSERT into KhachHang VALUES
('0001', 'ducnt', '123456', N'Nguyễn Thế Đức', '0868870166',  'ducnt@gmail.com'),
('0002', 'hieunm', '123456', N'Nguyễn Minh Hiếu', '0868870166',  'hieunm@gmail.com'),
('0003', 'huyvq', '123456', N'Vũ Quang Huy', '0868870166',  'huyvq@gmail.com'),
('0004', 'thuannh', '123456', N'Nguyễn Hoàng Thuận', '0868870166',  'thuannh@gmail.com'),
('0005', 'tungnk', '123456', N'Nguyễn Kỳ Tùng', '0868870166',  'tungnk@gmail.com');

create TABLE SanPham(
    IDSP varchar(10) not null,
    TenSanPham NVARCHAR(100) not NULL,
    ThuongHieu NVARCHAR(30) not NULL,
    Loai NVARCHAR(50) not NULL,
    GiaTien int not null,
    Size char(2),
    Mausac VARCHAR(30) not NULL,
    Soluong int not NULL,
    MoTa NVARCHAR(300),
    CONSTRAINT KhoaChinhSP PRIMARY KEY(IDSP)
);


CREATE TABLE LinkAnh(
    IDSP varchar(10) not null,
    RootPath VARCHAR(200) not NULL,
    FilePath VARCHAR(200) not NULL,
    PRIMARY KEY(FilePath),
    FOREIGN KEY(IDSP) REFERENCES SanPham(IDSP)
);



CREATE TABLE GiaoDich(
    MaGiaoDich CHAR(4) not NULL,
    IDKH CHAR(4) not NULL,
    DiaChiNhanHang NVARCHAR(100) not NULL,
    ThoiGianGiaoHang DATETIME not NULL,
    CONSTRAINT KhoaChinhGD PRIMARY KEY(MaGiaoDich),
    CONSTRAINT KhoaNgoaiGD FOREIGN KEY(IDKH) REFERENCES KhachHang(IDKH)
);

Use NMCNPMV2;
INSERT into GiaoDich VALUES
('NH01', '0001', N'Hai Bà Trưng, Hà Nội', '8h-25/11/2019');


CREATE TABLE DonHang(
    MaGiaoDich CHAR(4) not NULL,
    IDSP varchar(10) not null,
    SoLuongSP int not NULL,
    TongThanhToan int not NULL,
    TrangThai char(10) not NULL
    CONSTRAINT KhoaChinhDH PRIMARY KEY(MaGiaoDich, IDSP),
    CONSTRAINT KhoaNgoaiDH 
        FOREIGN KEY(MaGiaoDich) REFERENCES GiaoDich(MaGiaoDich),
        FOREIGN KEY(IDSP) REFERENCES SanPham(IDSP)
);

Use NMCNPMV2;
INSERT into DonHang VALUES
('NH01', 'SP01', 2, 4000000, 'cho xac nhan');


CREATE TABLE SPGiamGia(
    MaGiamGia VARCHAR(6) not NULL,
    IDSP VARCHAR(10) not NULL,
    HeSoGiam int not null,
    ThoiGianBD DATETIME not null,
    ThoiGianKT DATETIME not NULL,
    PRIMARY KEY(MaGiamGia),
    CONSTRAINT KhoaNgoaiGG FOREIGN KEY(IDSP) REFERENCES SanPham(IDSP),
    check(ThoiGianBD < ThoiGianKT)  
);
Use NMCNPMV2;
INSERT into SPGiamGia VALUES
('PR0001', 'SP01', 20, '24/12/2019', '25/12/2019');

Use NMCNPMV2;
INSERT into LinkAnh VALUES
('SP02', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-gau-chap-va-xanh-dam-01.jpg'),
('SP02', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-gau-chap-va-xanh-dam-02.jpg'),
('SP02', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-gau-chap-va-xanh-dam-03.jpg'),
('SP02', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-gau-chap-va-xanh-dam-04.jpg'),
('SP02', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-gau-chap-va-xanh-dam-05.jpg'),
('SP02', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-gau-chap-va-xanh-dam-06.jpg'),
('SP03', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-xanh-nhat-01.jpg'),
('SP03', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-xanh-nhat-02.jpg'),
('SP03', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-xanh-nhat-03.jpg'),
('SP03', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-xanh-nhat-04.jpg'),
('SP03', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-xanh-nhat-05.jpg'),
('SP03', 'Abc', 'images/bottom/caco-quan-jeans-cap-cao-rua-xanh-nhat-06.jpg'),
('SP04', 'Abc', 'images/bottom/eun-soo-quan-baggy-trang 01.jpg'),
('SP04', 'Abc', 'images/bottom/eun-soo-quan-baggy-trang02.jpg'),
('SP04', 'Abc', 'images/bottom/eun-soo-quan-baggy-trang 03 (copy).jpg'),
('SP04', 'Abc', 'images/bottom/eun-soo-quan-baggy-trang 03.jpg'),
('SP04', 'Abc', 'images/bottom/eun-soo-quan-baggy-trang 05.JPG'),
('SP04', 'Abc', 'images/bottom/eun-soo-quan-baggy-trang.jpg'),
('SP05', 'Abc', 'images/bottom/Gisy-quan-cap-cao-ong-loe-mau-xanh-navy-001.jpg'),
('SP05', 'Abc', 'images/bottom/Gisy-quan-cap-cao-ong-loe-mau-xanh-navy-002.jpg'),
('SP05', 'Abc', 'images/bottom/Gisy-quan-cap-cao-ong-loe-mau-xanh-navy-003.jpg'),
('SP05', 'Abc', 'images/bottom/Gisy-quan-cap-cao-ong-loe-mau-xanh-navy-004.jpg'),
('SP05', 'Abc', 'images/bottom/Gisy-quan-cap-cao-ong-loe-mau-xanh-navy-005.jpg'),
('SP05', 'Abc', 'images/bottom/Gisy-quan-cap-cao-ong-loe-mau-xanh-navy-006.jpg'),
('SP06', 'Abc', 'images/bottom/Gisy-quan-suong-mat-ca-mau-hong-man-001.jpg'),
('SP06', 'Abc', 'images/bottom/Gisy-quan-suong-mat-ca-mau-hong-man-002.jpg'),
('SP06', 'Abc', 'images/bottom/Gisy-quan-suong-mat-ca-mau-hong-man-003.jpg'),
('SP06', 'Abc', 'images/bottom/Gisy-quan-suong-mat-ca-mau-hong-man-004.jpg'),
('SP06', 'Abc', 'images/bottom/Gisy-quan-suong-mat-ca-mau-hong-man-005.jpg'),
('SP06', 'Abc', 'images/bottom/Gisy-quan-suong-mat-ca-mau-hong-man-006.jpg'),
('SP07', 'Abc', 'images/bottom/hobb-quan-cap-to-khoa-hong-dan-day-gau-den-01.jpg'),
('SP07', 'Abc', 'images/bottom/hobb-quan-cap-to-khoa-hong-dan-day-gau-den-02.jpg'),
('SP07', 'Abc', 'images/bottom/hobb-quan-cap-to-khoa-hong-dan-day-gau-den-03.jpg'),
('SP07', 'Abc', 'images/bottom/hobb-quan-cap-to-khoa-hong-dan-day-gau-den-04.jpg'),
('SP07', 'Abc', 'images/bottom/hobb-quan-cap-to-khoa-hong-dan-day-gau-den-05.jpg'),
('SP07', 'Abc', 'images/bottom/hobb-quan-cap-to-khoa-hong-dan-day-gau-den-06.jpg'),
('SP08', 'Abc', 'images/bottom/LLANH-DESIDN-quan-suong-mau-xanh-la-001.jpg'),
('SP08', 'Abc', 'images/bottom/LLANH-DESIDN-quan-suong-mau-xanh-la-002.jpg'),
('SP08', 'Abc', 'images/bottom/LLANH-DESIDN-quan-suong-mau-xanh-la-003.jpg'),
('SP08', 'Abc', 'images/bottom/LLANH-DESIDN-quan-suong-mau-xanh-la-004.jpg'),
('SP08', 'Abc', 'images/bottom/LLANH-DESIDN-quan-suong-mau-xanh-la-005.jpg'),
('SP08', 'Abc', 'images/bottom/LLANH-DESIDN-quan-suong-mau-xanh-la-006.jpg'),
('SP09', 'Abc', 'images/bottom/LLANH-DESIDN-uan-ong-suong-mau-be-001.jpg'),
('SP09', 'Abc', 'images/bottom/LLANH-DESIDN-uan-ong-suong-mau-be-002.jpg'),
('SP09', 'Abc', 'images/bottom/LLANH-DESIDN-uan-ong-suong-mau-be-003.jpg'),
('SP09', 'Abc', 'images/bottom/LLANH-DESIDN-uan-ong-suong-mau-be-004.jpg'),
('SP09', 'Abc', 'images/bottom/LLANH-DESIDN-uan-ong-suong-mau-be-005.jpg'),
('SP09', 'Abc', 'images/bottom/LLANH-DESIDN-uan-ong-suong-mau-be-006.jpg'),
('SP10', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-den-001.jpg'),
('SP10', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-den-002.jpg'),
('SP10', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-den-003.jpg'),
('SP10', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-den-004.jpg'),
('SP10', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-den-005.jpg'),
('SP10', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-den-006.jpg'),
('SP11', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-xanh-navy-anh-kim-tuyen-001.jpg'),
('SP11', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-xanh-navy-anh-kim-tuyen-002.jpg'),
('SP11', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-xanh-navy-anh-kim-tuyen-003.jpg'),
('SP11', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-xanh-navy-anh-kim-tuyen-004.jpg'),
('SP11', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-xanh-navy-anh-kim-tuyen-005.jpg'),
('SP11', 'Abc', 'images/bottom/Lumos-quan-culotte-tui-cheo-beo-gau-xanh-navy-anh-kim-tuyen-006.jpg'),
('SP12', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-den-01.jpg'),
('SP12', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-den-02.jpg'),
('SP12', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-den-03.jpg'),
('SP12', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-den-04.jpg'),
('SP12', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-den-05.jpg'),
('SP12', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-den-06.jpg'),
('SP13', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-ghi-01.jpg'),
('SP13', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-ghi-02.jpg'),
('SP13', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-ghi-03.jpg'),
('SP13', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-ghi-04.jpg'),
('SP13', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-ghi-05.jpg'),
('SP13', 'Abc', 'images/bottom/nep-nep-quan-dang-bom-chun-cap-ghi-06.jpg'),
('SP14', 'Abc', 'images/bottom/pura-mela-quan-gia-vay-xe-truoc-den-01.jpg'),
('SP14', 'Abc', 'images/bottom/pura-mela-quan-gia-vay-xe-truoc-den-02.jpg'),
('SP14', 'Abc', 'images/bottom/pura-mela-quan-gia-vay-xe-truoc-den-03.jpg'),
('SP14', 'Abc', 'images/bottom/pura-mela-quan-gia-vay-xe-truoc-den-04.jpg'),
('SP14', 'Abc', 'images/bottom/pura-mela-quan-gia-vay-xe-truoc-den-05.jpg'),
('SP14', 'Abc', 'images/bottom/pura-mela-quan-gia-vay-xe-truoc-den-06.jpg'),
('SP15', 'Abc', 'images/bottom/pura-mela-skort-cuc-than-truoc-den-01.jpg'),
('SP15', 'Abc', 'images/bottom/pura-mela-skort-cuc-than-truoc-den-02.jpg'),
('SP15', 'Abc', 'images/bottom/pura-mela-skort-cuc-than-truoc-den-03.jpg'),
('SP15', 'Abc', 'images/bottom/pura-mela-skort-cuc-than-truoc-den-04.jpg'),
('SP15', 'Abc', 'images/bottom/pura-mela-skort-cuc-than-truoc-den-05.jpg'),
('SP15', 'Abc', 'images/bottom/pura-mela-skort-cuc-than-truoc-den-06.jpg'),
('SP16', 'Abc', 'images/bottom/touch-quan-om-loe-den-ke-trang-01.jpg'),
('SP16', 'Abc', 'images/bottom/touch-quan-om-loe-den-ke-trang-02.jpg'),
('SP16', 'Abc', 'images/bottom/touch-quan-om-loe-den-ke-trang-03.jpg'),
('SP16', 'Abc', 'images/bottom/touch-quan-om-loe-den-ke-trang-04.jpg'),
('SP16', 'Abc', 'images/bottom/touch-quan-om-loe-den-ke-trang-05.jpg'),
('SP16', 'Abc', 'images/bottom/touch-quan-om-loe-den-ke-trang-06.jpg'),
('SP17', 'Abc', 'images/top/ferosh-hc-dam-3d-xanh-da-troi-3d(1).jpg'),
('SP17', 'Abc', 'images/top/ferosh-hc-dam-3d-xanh-da-troi-3d.jpg'),
('SP17', 'Abc', 'images/top/ferosh-hc-dam-3d-xanh-da-troi-back.jpg'),
('SP17', 'Abc', 'images/top/ferosh-hc-dam-3d-xanh-da-troi-detial.jpg'),
('SP17', 'Abc', 'images/top/ferosh-hc-dam-3d-xanh-da-troi-front.jpg'),
('SP17', 'Abc', 'images/top/ferosh-hc-dam-3d-xanh-da-troi-side.jpg'),
('SP18', 'Abc', 'images/top/ferosh-hobb-dam-om-lech-vai-den-3d(1).jpg'),
('SP18', 'Abc', 'images/top/ferosh-hobb-dam-om-lech-vai-den-3d.jpg'),
('SP18', 'Abc', 'images/top/ferosh-hobb-dam-om-lech-vai-den-front(1) (copy).jpg'),
('SP18', 'Abc', 'images/top/ferosh-hobb-dam-om-lech-vai-den-front(1).jpg'),
('SP18', 'Abc', 'images/top/ferosh-hobb-dam-om-lech-vai-den-front.jpg'),
('SP18', 'Abc', 'images/top/ferosh-hobb-dam-om-lech-vai-den-side.jpg'),
('SP19', 'Abc', 'images/top/ferosh-hobb-vay-maxi-2-tang-3d.jpg'),
('SP19', 'Abc', 'images/top/ferosh-hobb-vay-maxi-2-tang-back.jpg'),
('SP19', 'Abc', 'images/top/ferosh-hobb-vay-maxi-2-tang-detail.jpg'),
('SP19', 'Abc', 'images/top/ferosh-hob-bvay-maxi-2-tang-front(1).jpg'),
('SP19', 'Abc', 'images/top/ferosh-hob-bvay-maxi-2-tang-front.jpg'),
('SP19', 'Abc', 'images/top/ferosh-hobb-vay-maxi-2-tang-side.jpg'),
('SP20', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-3d(1).jpg'),
('SP20', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-3d.jpg'),
('SP20', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-back.jpg'),
('SP20', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-front(1).jpg'),
('SP20', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-front.jpg'),
('SP20', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-side.jpg'),
('SP21', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-hong-nhat-3d(1).jpg'),
('SP21', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-hong-nhat-3d.jpg'),
('SP21', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-hong-nhat-back.jpg'),
('SP21', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-hong-nhat-detail.jpg'),
('SP21', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-hong-nhat-front.jpg'),
('SP21', 'Abc', 'images/top/ferosh-mhd-dam-co-tau-hong-nhat-side.jpg'),
('SP22', 'Abc', 'images/top/ferosh-mhd-dam-ha-eo-trang-chaDm-bi-3d(1).jpg'),
('SP22', 'Abc', 'images/top/ferosh-mhd-dam-ha-eo-trang-cham-bi-3d.jpg'),
('SP22', 'Abc', 'images/top/ferosh-mhd-dam-ha-eo-trang-cham-bi-back.jpg'),
('SP22', 'Abc', 'images/top/ferosh-mhd-dam-ha-eo-trang-cham-bi-detail.jpg'),
('SP22', 'Abc', 'images/top/ferosh-mhd-dam-ha-eo-trang-cham-bi-front.jpg'),
('SP22', 'Abc', 'images/top/ferosh-mhd-dam-ha-eo-trang-cham-bi-side.jpg'),
('SP23', 'Abc', 'images/top/ferosh-wephobia-dam-tay-chuong-vat-cheo-ghi-3d(1).jpg'),
('SP23', 'Abc', 'images/top/ferosh-wephobia-dam-tay-chuong-vat-cheo-ghi-3d.jpg'),
('SP23', 'Abc', 'images/top/ferosh-wephobia-dam-tay-chuong-vat-cheo-ghi-back.jpg'),
('SP23', 'Abc', 'images/top/ferosh-wephobia-dam-tay-chuong-vat-cheo-ghi-front(1).jpg'),
('SP23', 'Abc', 'images/top/ferosh-wephobia-dam-tay-chuong-vat-cheo-ghi-front.jpg'),
('SP23', 'Abc', 'images/top/ferosh-wephobia-dam-tay-chuong-vat-cheo-ghi-side.jpg'),
('SP24', 'Abc', 'images/top/hobb-dam-a-tay-lien-xep-nhun-be-01.jpg'),
('SP24', 'Abc', 'images/top/hobb-dam-a-tay-lien-xep-nhun-be-02.jpg'),
('SP24', 'Abc', 'images/top/hobb-dam-a-tay-lien-xep-nhun-be-03.jpg'),
('SP24', 'Abc', 'images/top/hobb-dam-a-tay-lien-xep-nhun-be-04.jpg'),
('SP24', 'Abc', 'images/top/hobb-dam-a-tay-lien-xep-nhun-be-05.jpg'),
('SP24', 'Abc', 'images/top/hobb-dam-a-tay-lien-xep-nhun-be-06.jpg'),
('SP25', 'Abc', 'images/top/hobb-dam-lech-vai-beo-trang-01.jpg'),
('SP25', 'Abc', 'images/top/hobb-dam-lech-vai-beo-trang-02.jpg'),
('SP25', 'Abc', 'images/top/hobb-dam-lech-vai-beo-trang-03.jpg'),
('SP25', 'Abc', 'images/top/hobb-dam-lech-vai-beo-trang-04.jpg'),
('SP25', 'Abc', 'images/top/hobb-dam-lech-vai-beo-trang-05.jpg'),
('SP25', 'Abc', 'images/top/hobb-dam-lech-vai-beo-trang-06.jpg'),
('SP26', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-olive-01.jpg'),
('SP26', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-olive-02.jpg'),
('SP26', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-olive-03.jpg'),
('SP26', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-olive-04.jpg'),
('SP26', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-olive-05.jpg'),
('SP26', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-olive-06.jpg'),
('SP27', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-tim-than-01.jpg'),
('SP27', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-tim-than-02.jpg'),
('SP27', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-tim-than-03.jpg'),
('SP27', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-tim-than-04.jpg'),
('SP27', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-tim-than-05.jpg'),
('SP27', 'Abc', 'images/top/hobb-dam-lech-vai-nhun-li-than-truoc-tim-than-06.jpg'),
('SP28', 'Abc', 'images/top/le-chat-dam-mullet-khong-tay-cuc-suon-lung-01.jpg'),
('SP28', 'Abc', 'images/top/le-chat-dam-mullet-khong-tay-cuc-suon-lung-02.jpg'),
('SP28', 'Abc', 'images/top/le-chat-dam-mullet-khong-tay-cuc-suon-lung-03.jpg'),
('SP28', 'Abc', 'images/top/le-chat-dam-mullet-khong-tay-cuc-suon-lung-04.jpg'),
('SP28', 'Abc', 'images/top/le-chat-dam-mullet-khong-tay-cuc-suon-lung-05.jpg'),
('SP28', 'Abc', 'images/top/le-chat-dam-mullet-khong-tay-cuc-suon-lung-06.jpg'),
('SP29', 'Abc', 'images/top/le-chat-dam-xoe-xeo-co-rong-beo-tay-hong-nau-01.jpg'),
('SP29', 'Abc', 'images/top/le-chat-dam-xoe-xeo-co-rong-beo-tay-hong-nau-02.jpg'),
('SP29', 'Abc', 'images/top/le-chat-dam-xoe-xeo-co-rong-beo-tay-hong-nau-03.jpg'),
('SP29', 'Abc', 'images/top/le-chat-dam-xoe-xeo-co-rong-beo-tay-hong-nau-04.jpg'),
('SP29', 'Abc', 'images/top/le-chat-dam-xoe-xeo-co-rong-beo-tay-hong-nau-05.jpg'),
('SP29', 'Abc', 'images/top/le-chat-dam-xoe-xeo-co-rong-beo-tay-hong-nau-06.jpg'),
('SP30', 'Abc', 'images/top/mhd-dam-suong-phoi-dang-ten-tay-gau-den-01.jpg'),
('SP30', 'Abc', 'images/top/mhd-dam-suong-phoi-dang-ten-tay-gau-den-02.jpg'),
('SP30', 'Abc', 'images/top/mhd-dam-suong-phoi-dang-ten-tay-gau-den-03.jpg'),
('SP30', 'Abc', 'images/top/mhd-dam-suong-phoi-dang-ten-tay-gau-den-04.jpg'),
('SP30', 'Abc', 'images/top/mhd-dam-suong-phoi-dang-ten-tay-gau-den-2.jpg'),
('SP30', 'Abc', 'images/top/mhd-dam-suong-phoi-dang-ten-tay-gau-den-5.jpg'),
('SP31', 'Abc', 'images/top/oche-dam-organza-trang-tay-lien-theu-hoa-jean-01.jpg'),
('SP31', 'Abc', 'images/top/oche-dam-organza-trang-tay-lien-theu-hoa-jean-02.jpg'),
('SP31', 'Abc', 'images/top/oche-dam-organza-trang-tay-lien-theu-hoa-jean-03.jpg'),
('SP31', 'Abc', 'images/top/oche-dam-organza-trang-tay-lien-theu-hoa-jean-04.jpg'),
('SP31', 'Abc', 'images/top/oche-dam-organza-trang-tay-lien-theu-hoa-jean-05.jpg'),
('SP31', 'Abc', 'images/top/oche-dam-organza-trang-tay-lien-theu-hoa-jean-06.jpg'),
('SP32', 'Abc', 'images/top/so-young-dam-dai-tay-xep-ly-chan-vay-den-phoi-line-nhung-hong-01.jpg'),
('SP32', 'Abc', 'images/top/so-young-dam-dai-tay-xep-ly-chan-vay-den-phoi-line-nhung-hong-02.jpg'),
('SP32', 'Abc', 'images/top/so-young-dam-dai-tay-xep-ly-chan-vay-den-phoi-line-nhung-hong-03.jpg'),
('SP32', 'Abc', 'images/top/so-young-dam-dai-tay-xep-ly-chan-vay-den-phoi-line-nhung-hong-04.jpg'),
('SP32', 'Abc', 'images/top/so-young-dam-dai-tay-xep-ly-chan-vay-den-phoi-line-nhung-hong-05-a.jpg'),
('SP32', 'Abc', 'images/top/so-young-dam-dai-tay-xep-ly-chan-vay-den-phoi-line-nhung-hong-06.jpg'),
('SP33', 'Abc', 'images/top/so-young-dam-tay-lien-beo-kem-belt-den-01.jpg'),
('SP33', 'Abc', 'images/top/so-young-dam-tay-lien-beo-kem-belt-den-02.jpg'),
('SP33', 'Abc', 'images/top/so-young-dam-tay-lien-beo-kem-belt-den-03.jpg'),
('SP33', 'Abc', 'images/top/so-young-dam-tay-lien-beo-kem-belt-den-04.jpg'),
('SP33', 'Abc', 'images/top/so-young-dam-tay-lien-beo-kem-belt-den-05.jpg'),
('SP33', 'Abc', 'images/top/so-young-dam-tay-lien-beo-kem-belt-den-06.jpg'),
('SP34', 'Abc', 'images/top/touch-dam-khong-tay-xep-co-cut-out-vat-hong-cam-nhat-01.jpg'),
('SP34', 'Abc', 'images/top/touch-dam-khong-tay-xep-co-cut-out-vat-hong-cam-nhat-02.jpg'),
('SP34', 'Abc', 'images/top/touch-dam-khong-tay-xep-co-cut-out-vat-hong-cam-nhat-03.jpg'),
('SP34', 'Abc', 'images/top/touch-dam-khong-tay-xep-co-cut-out-vat-hong-cam-nhat-04.jpg'),
('SP34', 'Abc', 'images/top/touch-dam-khong-tay-xep-co-cut-out-vat-hong-cam-nhat-05.jpg'),
('SP34', 'Abc', 'images/top/touch-dam-khong-tay-xep-co-cut-out-vat-hong-cam-nhat-07.jpg'),
('SP35', 'Abc', 'images/top/touch-dam-xoe-beo-tay-ho-vai-den-01.jpg'),
('SP35', 'Abc', 'images/top/touch-dam-xoe-beo-tay-ho-vai-den-02.jpg'),
('SP35', 'Abc', 'images/top/touch-dam-xoe-beo-tay-ho-vai-den-03.jpg'),
('SP35', 'Abc', 'images/top/touch-dam-xoe-beo-tay-ho-vai-den-04.jpg'),
('SP35', 'Abc', 'images/top/touch-dam-xoe-beo-tay-ho-vai-den-05.jpg'),
('SP35', 'Abc', 'images/top/touch-dam-xoe-beo-tay-ho-vai-den-06.jpg'),
('SP36', 'Abc', 'images/top/women-rock-dam-xoe-tay-lo-co-tron-ren-be-01.jpg'),
('SP36', 'Abc', 'images/top/women-rock-dam-xoe-tay-lo-co-tron-ren-be-02.jpg'),
('SP36', 'Abc', 'images/top/women-rock-dam-xoe-tay-lo-co-tron-ren-be-03.jpg'),
('SP36', 'Abc', 'images/top/women-rock-dam-xoe-tay-lo-co-tron-ren-be-04.jpg'),
('SP36', 'Abc', 'images/top/women-rock-dam-xoe-tay-lo-co-tron-ren-be-05.jpg'),
('SP36', 'Abc', 'images/top/women-rock-dam-xoe-tay-lo-co-tron-ren-be-06.jpg'),
('SP37', 'Abc', 'images/shoes/'),
('SP37', 'Abc', 'images/shoes/'),
('SP37', 'Abc', 'images/shoes/'),
('SP37', 'Abc', 'images/shoes/'),
('SP37', 'Abc', 'images/shoes/'),
('SP37', 'Abc', 'images/shoes/'),
('SP38', 'Abc', 'images/shoes/'),
('SP38', 'Abc', 'images/shoes/'),
('SP38', 'Abc', 'images/shoes/'),
('SP38', 'Abc', 'images/shoes/'),
('SP38', 'Abc', 'images/shoes/'),
('SP38', 'Abc', 'images/shoes/'),
('SP39', 'Abc', 'images/shoes/'),
('SP39', 'Abc', 'images/shoes/'),
('SP39', 'Abc', 'images/shoes/'),
('SP39', 'Abc', 'images/shoes/'),
('SP39', 'Abc', 'images/shoes/'),
('SP39', 'Abc', 'images/shoes/'),
('SP40', 'Abc', 'images/shoes/'),
('SP40', 'Abc', 'images/shoes/'),
('SP40', 'Abc', 'images/shoes/'),
('SP40', 'Abc', 'images/shoes/'),
('SP40', 'Abc', 'images/shoes/'),
('SP40', 'Abc', 'images/shoes/'),
('SP41', 'Abc', 'images/shoes/'),
('SP41', 'Abc', 'images/shoes/'),
('SP41', 'Abc', 'images/shoes/'),
('SP41', 'Abc', 'images/shoes/'),
('SP41', 'Abc', 'images/shoes/'),
('SP41', 'Abc', 'images/shoes/'),
('SP42', 'Abc', 'images/shoes/'),
('SP42', 'Abc', 'images/shoes/'),
('SP42', 'Abc', 'images/shoes/'),
('SP42', 'Abc', 'images/shoes/'),
('SP42', 'Abc', 'images/shoes/'),
('SP42', 'Abc', 'images/shoes/'),
('SP43', 'Abc', 'images/shoes/'),
('SP43', 'Abc', 'images/shoes/'),
('SP43', 'Abc', 'images/shoes/'),
('SP43', 'Abc', 'images/shoes/'),
('SP43', 'Abc', 'images/shoes/'),
('SP43', 'Abc', 'images/shoes/'),
('SP44', 'Abc', 'images/shoes/'),
('SP44', 'Abc', 'images/shoes/'),
('SP44', 'Abc', 'images/shoes/'),
('SP44', 'Abc', 'images/shoes/'),
('SP44', 'Abc', 'images/shoes/'),
('SP44', 'Abc', 'images/shoes/'),
('SP45', 'Abc', 'images/shoes/'),
('SP45', 'Abc', 'images/shoes/'),
('SP45', 'Abc', 'images/shoes/'),
('SP45', 'Abc', 'images/shoes/'),
('SP45', 'Abc', 'images/shoes/'),
('SP45', 'Abc', 'images/shoes/'),
('SP46', 'Abc', 'images/shoes/'),
('SP46', 'Abc', 'images/shoes/'),
('SP46', 'Abc', 'images/shoes/'),
('SP46', 'Abc', 'images/shoes/'),
('SP46', 'Abc', 'images/shoes/'),
('SP46', 'Abc', 'images/shoes/'),
('SP46', 'Abc', 'images/shoes/'),
('SP47', 'Abc', 'images/shoes/'),
('SP47', 'Abc', 'images/shoes/'),
('SP47', 'Abc', 'images/shoes/'),
('SP47', 'Abc', 'images/shoes/'),
('SP47', 'Abc', 'images/shoes/'),
('SP47', 'Abc', 'images/shoes/'),
('SP48', 'Abc', 'images/shoes/'),
('SP48', 'Abc', 'images/shoes/'),
('SP48', 'Abc', 'images/shoes/'),
('SP48', 'Abc', 'images/shoes/'),
('SP48', 'Abc', 'images/shoes/'),
('SP48', 'Abc', 'images/shoes/'),
('SP49', 'Abc', 'images/shoes/'),
('SP49', 'Abc', 'images/shoes/'),
('SP49', 'Abc', 'images/shoes/'),
('SP49', 'Abc', 'images/shoes/'),
('SP49', 'Abc', 'images/shoes/'),
('SP49', 'Abc', 'images/shoes/'),
('SP49', 'Abc', 'images/shoes/'),
('SP50', 'Abc', 'images/shoes/'),
('SP50', 'Abc', 'images/shoes/'),
('SP50', 'Abc', 'images/shoes/'),
('SP50', 'Abc', 'images/shoes/'),
('SP50', 'Abc', 'images/shoes/'),
('SP50', 'Abc', 'images/shoes/');