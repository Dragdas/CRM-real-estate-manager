# CRM Real Estate Manager

### Dlaczego powstał ten projekt?

PlaceholderPlaceholderPlaceholder

### Główne funkcjonalności 

<details><summary> Placeholder </summary>
<p>
PlaceholderPlaceholderPlaceholder

- PlaceholderPlaceholderPlaceholder
- PlaceholderPlaceholderPlaceholder
</p>
</details>

<details><summary> Placeholder </summary>
<p>

PlaceholderPlaceholderPlaceholder

- PlaceholderPlaceholderPlaceholder
</p>
</details>

### Stack

* Java 8
* Spring Boot
* Spring Security
* Hibernate
* H2
* Postgres
* Lombok

### How to run this? (for dummies)
<details><summary> 1.Narzędzia, które potrzebujesz </summary>
<p>

* Java 8 - Placeholder
* Maven - https://maven.apache.org/download.cgi
* Projekt - https://github.com/Dragdas/CRM-real-estate-manager
</p>
</details>

<details><summary> 2.  Ściąganie projektu </summary>
<p>

#### Nie masz gita:
* otwórz link https://github.com/Dragdas/PressArticleApi.git
* kliknij zielony przycisk "code" a następnie "download zip"

#### Masz gita:
* przejdź do folderu, do którego chcesz ściągnąć projekt
* uruchom cmd (możesz wpisać cmd w pasku adresu)
* użyj komendy:
```
git clone https://github.com/Dragdas/PressArticleApi.git
```
</p>
</details>

<details><summary> 3. Budowanie projektu </summary>
<p>

#### Jeżeli mvn jest zdefiniowany w Twoich zmiennych środowiskowych:
* przejdź do ściągniętego repozytorium (przez cmd lub ponownie wpisz cmd w adresie folderu)
* użyj komendy
```
mvn clean install
```
#### Jeżeli mvn nie jest zdefiniowane w Twoich zmiennych środowiskowych:

* możesz podać dokladną ścieżkę do pliku mvn znajdującego się w archiwum z pkt 1.
  Przykładowa komenda:
```
  "C:\Program Files\maven\bin\mvn" clean install
```
</p>
</details>

<details><summary> 4. Uruchomienie projektu </summary>
<p>

#### Jeżeli chcesz użyć mavena
* w głównym folderze projektu użyj komendy:
```
  mvn spring-boot:run
```

#### Jeżeli Java jest zdefiniowana w Twoich zmiennych środowiskowych
* przejdź do folderu target w ściągniętym repozytorium
* użyj komendy:
```
java -jar PressArticleApi-0.0.1-SNAPSHOT.jar
```
#### Jeżeli Java nie jest zdefiniowana w Twoich zmiennych środowiskowych
* użyj dokładnej ścieżki do pliku Java.exe znajdującego się w Java JDK z pkt 1. Przykładowa komenda:
```
"C:\Program Files\Java\jdk-11.0.15.1\bin\java" -jar PressArticleApi-0.0.1-SNAPSHOT.jar
```
</p>
</details>

### Opis endpointów

Deploy został przeprowadzony z użyciem Heroku pod adresem: 

https://crm-real-estate-manager.herokuapp.com/

<details><summary> 1. Właściciele we wspólnocie </summary>
<p>

#### Get all owners

```http
  GET /v1/owners
```

#### Get owner

```http
  GET /v1/owners/${ownerId}
```

| Parameter | Type   | Description                        |
| :-------- | :----- | :--------------------------------- |
| `ownerId` | `Long` | **Required**. Id of owner to fetch |

#### Delete owner

```http
  DELETE /v1/owners/${ownerId}
```

| Parameter | Type   | Description                         |
| :-------- | :----- | :---------------------------------  |
| `ownerId` | `Long` | **Required**. Id of owner to delete |

#### Edit owner

```http
  PUT /v1/owners
```

| Parameter           | Type     | Description                       |
| :------------------ | :------- | :-------------------------------  |
| `ownerId`           | `String` | **Required**. Id of owner to edit |
| `personalData`      | `String` | Owner's personal data             |
| `forwardingAddress` | `String` | Accomodation address              |
| `dataToInvoice`     | `String` | Data to invoice                   |
| `addressToInvoice`  | `String` | Address to send invoice to        |

#### Create owner

```http
  POST /v1/owners
```

| Parameter           | Type     | Description                       |
| :------------------ | :------- | :-------------------------------  |
| `ownerId`           | `String` | **Required**. Id of owner to edit |
| `personalData`      | `String` | Owner's personal data             |
| `forwardingAddress` | `String` | Accomodation address              |
| `dataToInvoice`     | `String` | Data to invoice                   |
| `addressToInvoice`  | `String` | Address to send invoice to        |
</p>
</details>
