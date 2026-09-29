# Tugas Spring Boot — 5W, John Travolta, Persamaan Kuadrat

Project tugas Spring Boot sederhana dengan 3 versi:
- V1: endpoint dasar
- V2: endpoint dengan JSON + validasi sederhana
- V3: versi pengembangan dengan riwayat perhitungan dan Swagger-style API documentation melalui komentar

## Requirement
- Java 17+
- Maven 3.9+
- Spring Boot 3.x

## Menjalankan
```bash
mvn spring-boot:run
```

Aplikasi berjalan di:
http://localhost:8080

## Endpoint
### 1. 5W tentang Spring
`GET /api/spring/5w`

### 2. John Travolta menggunakan Spring
`GET /api/john-travolta`

### 3. Persamaan Kuadrat
Contoh:
`GET /api/kuadrat?a=1&b=-5&c=6`

Hasil akar: x1=3 dan x2=2.

## Versi
### V1
Endpoint paling sederhana untuk membuktikan konsep Spring Boot.

### V2
Response dibuat lebih terstruktur dan input persamaan kuadrat memakai parameter.

### V3
Ditambahkan riwayat perhitungan dan endpoint informasi aplikasi.

## Riwayat Pengembangan

### V1
Versi awal:
- Spring Boot
- Endpoint 5W tentang Spring
- Endpoint John Travolta
- Endpoint persamaan kuadrat

### V2
Pengembangan:
- Tampilan web HTML
- Kalkulator persamaan kuadrat
- Interaksi JavaScript dengan REST API

### V3
Pengembangan lanjutan:
- Validasi input
- Pilihan contoh persamaan
- Deteksi jenis akar
- Dukungan akar kompleks
- Riwayat perhitungan
- Tombol reset dan hapus riwayat

## Pengujian

Persamaan yang diuji:

- `x² - 5x + 6 = 0`
- `x² - 4x + 4 = 0`
- `x² + 2x + 5 = 0`
- Input `a = 0`
