
Library


Piece of code sharable library

Rest API

-> Representational State transfer  : of object


MakeMyTrip ———————> Indigo

Happyfares (UI) -> HappyFares (Backend call ). ——>   Indigo service ——> DB


1. GET : To fetch a resource from server
2. POST: To create resource to the server, we send a resource
3. PUT: To update or create a resource on the server.
4. DELETE:
5. OPTIONS
6. TRACE


Microservices


Controller -> Request Interceptor : Web interaction

Service -> Business logic -> perform business logic execution

Repository -> Data layer : database call

Model/Entity/POJO/DTO


URI -> Uniqually resource identifier


http://<host_name>:<port>/<context-path>/<api_name>


Get me all flight details which are in range of 10-October-2021 to 10-Nov-2021

https://indigo/api/getFlights?startDate=10-10-2021&endDate=10-11-2021

https://indigo/api/getFlights/10-11-2021

http://localhost:8080/api/getFlights?startDate=10-10-2021&endDate=10-11-2021.  -? List<FlightDetaills>	





