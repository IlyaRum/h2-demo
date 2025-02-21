# Spring Boot приложения с использованием базы данных H2

### Запуск приложения

```bash
mvn spring-boot:run
```

После запуска открыть веб-консоль H2 по адресу `http://localhost:8080/h2-console` и проверить содержимое базы данных.
- Также вы можете отправить GET-запрос на адрес `http://localhost:8080/users`, чтобы получить список пользователей.

### Дополнительная информация

- Если нужна база данных H2, которая сохраняется между перезапусками приложения, замените строку подключения на:

  ```properties
  spring.datasource.url=jdbc:h2:file:/path/to/your/db/testdb
  spring.jpa.hibernate.ddl-auto=update
  ```
  где `/path/to/your/db/` — путь до директории, в которой будет храниться база данных.

- Пример:
  ```properties
  spring.datasource.url=jdbc:h2:file:./testH2db
  ```

