Feature: Trendyol Ana Sayfa Testi

  Scenario: Ürün Arama
    Given Kullanıcı trenyol "baseUrl" e gider
    When kullanıcı arama cubuguna "laptop" yazar ve enter'a basar
    Then Sonuclarda "laptop" kelimesi görünür oldugu kontrol edilir