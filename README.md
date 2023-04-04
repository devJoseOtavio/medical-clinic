# medical-clinic

#### Technology

<ul>
  <li>SpringBoot 3</li>
  <li>Java 17</li>
  <li>Lombok</li>
  <li>MySQL / FlyWay</li>
  <li>JPA / Hibernate</li>
  <li>Maven</li>
  <li>Insomnia / Postman</li>
</ul>

#### Usage
<ul>
  <li>This project requires Java v17 or later.</li>
  <li>you should also update your file application.properties to include your data source username and password.</li>
  <li>you need an api platform to test the application, I recommend using postMan or insomnia.</li>
</ul>

#### Doctor Data for POST, PUT, LIST and DELETE sending

+ post - url: http://localhost:8080/doctors
  + Response 200 (application/json)

      + Body

             {
              "name": "Jose Otavio",
              "email": "jose.otavio@clinic.med",
              "crm": "883765",
              "telephone": "996130678",
              "speciality": "ORTHOPEDICS",
              "address": {
                  "publicplace": "rua 1",
                  "neighborhood": "bairro",
                  "zipcode": "12345678",
                  "city": "Joinville",
                  "state": "SC",
                  "number": "1",
                  "complement": "complemento"
                  }
              }
              
+ put - url: http://localhost:8080/doctors
   + Response 200 (application/json)

      + Body

            {
              "id" : 1,
              "name" : "jose otavio2",
              "crm": "553765"
            }
            
+ get - url: http://localhost:8080/doctors

+ delete - url: http://localhost:8080/doctors

#### Patient Data for POST, PUT, LIST and DELETE sending

+ post - url: http://localhost:8080/patients
  + Response 200 (application/json)

      + Body

             {
              "name": "Jose Otavio",
              "email": "jose.otavio@clinic.med",
              "telephone": "996130678",
              "cpfcnpj": "12345678910",
              "address": {
                  "publicplace": "rua 1",
                  "neighborhood": "bairro",
                  "zipcode": "12345678",
                  "city": "Joinville",
                  "state": "SC",
                  "number": "1",
                  "complement": "complemento"
                  }
              }
              
+ put - url: http://localhost:8080/patients
   + Response 200 (application/json)

      + Body

            {
              "id" : 1,
              "name" : "jose otavio2",
              "cpfcnpj" : "1234567891234"
            }
            
+ get - url: http://localhost:8080/patients

+ delete - url: http://localhost:8080/patients
