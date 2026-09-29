# UAS Mandiri - Pemrograman Spring Framework

**Nama:** Finia Naisyah Putri  
**NIM:** 12409011010017  
**Mata Kuliah:** Pemrograman Framework  
**Dosen Pengampu:** Rizal Broer, M.Kom.  

---

## 1. Topik Spring Framework (5W1H)

* **What (Apa):** Spring Framework adalah *framework open-source* berbasis Java yang dirancang untuk mempermudah dan mempercepat pengembangan aplikasi enterprise. Spring menyediakan infrastruktur komprehensif dengan fitur utama seperti *Inversion of Control* (IoC) dan *Dependency Injection* (DI).
* **Why (Mengapa):** 
  * Mengurangi ketergantungan antar-objek (*loose coupling*).
  * Menyederhanakan konfigurasi melalui anotasi (`@Component`, `@Service`, `@Autowired`).
  * Memiliki ekosistem yang luas dan terintegrasi dengan baik untuk berbagai kebutuhan enterprise.
* **Who (Siapa):** Digunakan oleh para pengembang perangkat lunak Java (*Java Developers*), perekayasa sistem enterprise, serta perusahaan skala kecil hingga global.
* **Where (Di mana):** Digunakan pada layer *backend* aplikasi enterprise, sistem *microservices*, *RESTful Web Services*, aplikasi e-commerce, hingga sistem perbankan.
* **When (Kapan):** Digunakan saat membangun aplikasi Java berpola enterprise/kompleks yang membutuhkan arsitektur terstruktur, pemisahan logika bisnis yang jelas, dan manajemen dependensi yang efisien.
* **How (Bagaimana):** Spring bekerja menggunakan *Spring IoC Container* (`AnnotationConfigApplicationContext`) untuk membaca anotasi kelas, membuat instansiasi objek (*Beans*), serta mengelola pemetaan dependensi dan siklus hidup objek secara otomatis.

---

## 2. Struktur Project

Project ini dibangun menggunakan **Maven**, **JDK 23**, dan **Spring Context 6.1.5**.

```text
src/main/java/org/example/example/
├── JohnTravolta.java
├── PersamaanKuadratService.java
└── MainApp.
