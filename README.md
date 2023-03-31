# medical-clinic

Technology

<ul>
  <li>SpringBoot 3</li>
  <li>Java 17</li>
  <li>Lombok</li>
  <li>MySQL / FlyWay</li>
  <li>JPA / Hibernate</li>
  <li>Maven</li>
  <li>Insomnia</li>
</ul>


#### Data for POST and PUT sending
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
              "name" : "jose otavio2"
            }
