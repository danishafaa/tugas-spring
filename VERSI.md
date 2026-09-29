# Pembagian Versi Tugas

## V1 — Dasar
Tujuan: membuktikan bahwa Spring Boot berhasil berjalan.
- Main application
- Endpoint 5W
- Endpoint John Travolta
- Endpoint persamaan kuadrat

## V2 — JSON
Tujuan: membuat hasil endpoint lebih informatif.
- JSON terstruktur
- Parameter a, b, c
- Perhitungan diskriminan
- Dua akar, akar kembar, dan akar kompleks

## V3 — Pengembangan Aplikasi

Pada versi ketiga, aplikasi dikembangkan dengan beberapa fitur tambahan:

- Tampilan web yang lebih informatif.
- Validasi input persamaan kuadrat.
- Nilai `a` tidak boleh 0.
- Pilihan contoh persamaan kuadrat.
- Menampilkan diskriminan.
- Menampilkan jenis akar.
- Menampilkan akar real maupun kompleks.
- Riwayat maksimal 5 perhitungan.
- Tombol reset form.
- Tombol menghapus riwayat.

### Contoh kasus yang diuji

1. `x² - 5x + 6 = 0`
    - Dua akar real berbeda.
    - x₁ = 3
    - x₂ = 2

2. `x² - 4x + 4 = 0`
    - Satu akar real kembar.
    - x = 2

3. `x² + 2x + 5 = 0`
    - Akar kompleks.
