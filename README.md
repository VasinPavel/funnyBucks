
# funnyBucks
Сервис, который обращается к сервису курсов валют, и отдает gif в ответ.

``` 
Если курс по отношению к базовой валюте за сегодня стал выше вчерашнего,  
то пользователь получает случайную GIF отсюда https://giphy.com/search/rich  

Если курс по отношению к базовой валюте за сегодня стал ниже вчерашнего,
то пользователь получает случайную GIF отсюда https://giphy.com/search/broke  

Ссылки  
REST API курсов валют - https://docs.openexchangerates.org/  
REST API гифок - https://developers.giphy.com/docs/api#quick-start-guide  

Сервис написан на Spring Boot 2 + Java 11.
Для сборки проекта используется Gradle.  
Для взаимодействия с внешними сервисами используется Feign 

На сервис написаны модульные и интеграционные тесты.
```  
***
# Инструкция:

Для запуска проекта необходимо запустить файл .jar командой в консоли:
```
java -jar funnyBucks1.0.jar
```  
Перейти на:
```
localhost:8080/main
```


## Запуск через Doker

Создать Doker образ. Для этого необходимо выполнить команду из корневой папки проекта:
```
docker build -t funnyBucks .
```
Запуск контейнера:
```
docker run -p 8080:8080 funnyBucks
```


***
- Все настройки проекта находятся в файле ``` funnyBucks/src/main/resources/application.properties ```

- На данный момент базовой валютой для сравнения с другими валютами выбран доллар США (USD). Базовую валюту можно изменить в соответствующей строке файла настроек.


- Начальная страница проекта ```localhost:8080/main```. На ней можно выбрать валюту, сравнение с которой будет проводится.

- Так же доступны прямые url запросы, типа ```localhost:8080/main/value```, где ```value``` код валюты.

