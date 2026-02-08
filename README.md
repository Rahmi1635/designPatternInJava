Factory Pattern – Java Ödeme Sistemi Örneği

Bu proje, Factory Design Pattern’ın Java ile nasıl uygulanabileceğini göstermek amacıyla hazırlanmıştır.
Örnek senaryo olarak bir ödeme sistemi (Payment System) ele alınmıştır.

Proje, klasik if-else tabanlı nesne oluşturma yaklaşımının neden problemli olduğunu ve bunun yerine daha esnek ve sürdürülebilir bir çözümün nasıl kurulabileceğini göstermektedir.


Problem Tanımı : 


Uygulamalarda farklı türlerde nesneler oluşturulması gerektiğinde, çoğu zaman aşağıdaki gibi bir yaklaşım kullanılır:

if-else veya switch-case blokları

String karşılaştırmaları

Factory sınıfının sürekli değiştirilmesi


Bu yaklaşım:

Open/Closed Principle (OCP)’ı ihlal eder

Kodun okunabilirliğini düşürür

Yeni türler eklendikçe bakımı zorlaştırır


Çözüm Yaklaşımı


Bu projede, nesne oluşturma mantığı Factory Pattern kullanılarak merkezi bir yapıya taşınmıştır.

Ödeme türleri:

Bank Transfer

Credit Card

PayPal

Her ödeme türü Payment arayüzünü implemente eder ve nesne oluşturma işlemi Map + Supplier yapısı üzerinden gerçekleştirilir.


Bu sayede:


if-else zincirleri ortadan kalkar

String bağımlılığı azaltılır

Kod daha okunabilir ve genişletilebilir hale gelir


Kullanılan Yapılar ve Teknolojiler


Java 8+

Factory Design Pattern

Enum

Map

Supplier (java.util.function)


Proje Yapısı (Özet)


Payment → Ortak arayüz

BankTransferPayment → Somut ödeme sınıfı

CreditCardPayment → Somut ödeme sınıfı

PaypalPayment → Somut ödeme sınıfı

PaymentType → Ödeme türlerini temsil eden enum

PaymentFactory → Nesne üretiminden sorumlu factory sınıfı


Notlar


Bu projede kullanılan yapı, klasik if-else tabanlı çözümlere kıyasla daha temiz ve sürdürülebilirdir.
Ancak çok küçük projelerde bu yaklaşım gereksiz karmaşıklık yaratabilir.

Ama büyüyen ve değişime açık sistemlerde Factory Pattern güçlü bir çözümdür.
