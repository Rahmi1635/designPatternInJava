💳 Factory Pattern – Java Ödeme Sistemi

📌 Bu proje, Factory Design Pattern’ın Java ile nasıl uygulanabileceğini göstermek amacıyla hazırlanmıştır.

Gerçek hayattan bir ödeme sistemi senaryosu üzerinden:

❌ Kötü yaklaşım (if-else)

✅ Doğru yaklaşım (Factory Pattern)

net bir şekilde ele alınmıştır.

❓ Problem Nedir?

Çoğu projede nesne üretimi şu şekilde yapılır:

if-else veya switch-case blokları

String karşılaştırmaları

Factory sınıfının sürekli değiştirilmesi

⚠️ Bu yaklaşım zamanla şu problemlere yol açar:

Open/Closed Principle ihlal edilir

Kod okunabilirliği düşer

Yeni tür eklemek zorlaşır

🛠️ Çözüm: Factory Pattern

Bu projede:

Nesne oluşturma sorumluluğu merkezi bir Factory yapısına taşınmıştır

Ödeme türleri enum ile temsil edilmiştir

Nesne üretimi Map + Supplier üzerinden yapılmaktadır

🎯 Kazanımlar:

✅ if-else zincirlerinden kurtulma

✅ Daha okunabilir kod

✅ Daha kolay genişletilebilir yapı

🧩 Kullanılan Yapılar

Java 8+

Factory Design Pattern

Enum

Map

Supplier

🗂️ Proje Yapısı

Payment → Ortak arayüz

BankTransferPayment → EFT / Havale

CreditCardPayment → Kredi Kartı

PaypalPayment → PayPal

PaymentType → Ödeme türleri (Enum)

PaymentFactory → Nesne üretimi

📝 Notlar

💡 Bu yapı:

Küçük projelerde gereksiz karmaşık olabilir

Ancak büyüyen ve değişime açık sistemler için çok güçlüdür
