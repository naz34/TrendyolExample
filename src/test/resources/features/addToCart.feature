Feature: Ürün Sepete Ekleme

  Scenario: Bir ürün sepete eklenir
    Given Kullanıcı trenyol "baseUrl" e gider
    When kullanıcı arama cubuguna "laptop" yazar ve enter'a basar
    And ilk ürünü sepete ekler
    Then sepetteki ürün sayısı "1" olmalıdır