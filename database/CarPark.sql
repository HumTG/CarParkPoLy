CREATE DATABASE CarParkPoLy

USE CarParkPoLy
GO

CREATE TABLE [LoaiXe] (
  [IDLoaiXe] INT IDENTITY,
  [TenLoaiXe] Nvarchar(50),
  PRIMARY KEY ([IDLoaiXe])
);

CREATE TABLE [Xe] (
  [IDXe] INT IDENTITY,
  [ID_LoaiXe] INT,
  [BienXe] Varchar(50),
  [SoLanGui] INT,
  PRIMARY KEY ([IDXe]),
  CONSTRAINT [FK_Xe.ID_LoaiXe]
    FOREIGN KEY ([ID_LoaiXe])
      REFERENCES [LoaiXe]([IDLoaiXe])
);

CREATE TABLE [NhanVien] (
  [IDNhanVien] INT IDENTITY,
  [UserName] Nvarchar(50),
  [PassWord] Nvarchar(50),
  [TenNhanVien] Nvarchar(50),
  [DiaChi] Nvarchar(50),
  [GioiTinh] Bit,
  [NgaySinh] Date,
  [CaLam] Nvarchar(50),
  [Luong] Decimal,
  [SDT] Varchar(10),
  [ChucVu] Bit,
  [TrangThai] Bit,
  PRIMARY KEY ([IDNhanVien])
);

CREATE TABLE [The] (
  [IDThe] INT IDENTITY,
  [ID_NhanVien] INT,
  [Ma_The] Varchar(50),
  [ID_Xe] INT,
  [Thoi_Gian_Vao] Nvarchar(50),
  [Thoi_Gian_Ra] Nvarchar(50),
  [Thoi_Gian_Gui] Nvarchar(50),
  [Url_Anh_Bien_So] Varchar(100),
  [Url_Anh_Khuon_Mat] Varchar(100),
  [Gia] Decimal,
  [TrangThai] Bit,
  PRIMARY KEY ([IDThe]),
  CONSTRAINT [FK_The.ID_Xe]
    FOREIGN KEY ([ID_Xe])
      REFERENCES [Xe]([IDXe]),
  CONSTRAINT [FK_The.ID_NhanVien]
    FOREIGN KEY ([ID_NhanVien])
      REFERENCES [NhanVien]([IDNhanVien])
);

INSERT INTO LoaiXe (TenLoaiXe)
VALUES ('Xe máy'),
       ('Ô tô 4 chỗ'),
       ('Ô tô 7 chỗ'),
       ('Xe tải'),
       ('Xe buýt');

INSERT INTO Xe (ID_LoaiXe, BienXe, SoLanGui)
VALUES (1, '51F1-12345', 3),
       (2, '51G2-23456', 5),
       (3, '51H3-34567', 2),
       (4, '51K4-45678', 4),
       (5, '51L5-56789', 1);

INSERT INTO NhanVien (UserName, PassWord, TenNhanVien, DiaChi, GioiTinh, NgaySinh, CaLam, Luong, SDT, ChucVu, TrangThai)
VALUES ('user1', 'password1', 'Nguyen Van A', '123 Nguyen Hue, TP.HCM', 1, '1990-05-15', 'Ca Sáng', 15000000, '0123456789', 0, 1),
       ('user2', 'password2', 'Tran Thi B', '456 Le Loi, TP.HCM', 0, '1995-10-20', 'Ca Chiều', 14000000, '0987654321', 1, 1),
       ('user3', 'password3', 'Hoang Van C', '789 Tran Hung Dao, TP.HCM', 1, '1988-12-03', 'Ca Tối', 16000000, '0369852147', 0, 1),
       ('user4', 'password4', 'Le Thi D', '321 Nguyen Trai, TP.HCM', 0, '1992-08-25', 'Ca Sáng', 15500000, '0321478963', 1, 1),
       ('user5', 'password5', 'Pham Van E', '741 Vo Van Tan, TP.HCM', 1, '1993-04-17', 'Ca Chiều', 14500000, '0852147963', 0, 1);

INSERT INTO The (ID_NhanVien, Ma_The, ID_Xe, Thoi_Gian_Vao, Thoi_Gian_Ra, Thoi_Gian_Gui, Url_Anh_Bien_So, Url_Anh_Khuon_Mat, Gia, TrangThai)
VALUES (1, 'A123456', 1, '2024-05-09 08:00:00', '2024-05-09 18:00:00', '10 giờ', 'url_anh_bien_so_1.jpg', 'url_anh_khuon_mat_1.jpg', 100000, 1),
       (2, 'B234567', 2, '2024-05-09 09:30:00', '2024-05-09 17:30:00', '8 giờ', 'url_anh_bien_so_2.jpg', 'url_anh_khuon_mat_2.jpg', 120000, 1),
       (3, 'C345678', 3, '2024-05-09 07:45:00', '2024-05-09 16:45:00', '9 giờ', 'url_anh_bien_so_3.jpg', 'url_anh_khuon_mat_3.jpg', 110000, 1),
       (4, 'D456789', 4, '2024-05-09 10:15:00', '2024-05-09 19:15:00', '9 giờ', 'url_anh_bien_so_4.jpg', 'url_anh_khuon_mat_4.jpg', 150000, 1),
       (5, 'E567890', 5, '2024-05-09 08:45:00', '2024-05-09 17:45:00', '9 giờ', 'url_anh_bien_so_5.jpg', 'url_anh_khuon_mat_5.jpg', 130000, 1);


