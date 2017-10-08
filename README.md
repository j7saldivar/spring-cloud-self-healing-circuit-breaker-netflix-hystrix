# spring-cloud-self-healing-circuit-breaker-netflix-hystrix

## Plain Hystrix
1) Start discovery server
2) Start weather-service
3) Start weather-app
4) Start hystrix-dashboard
5) Go to http://localhost:8000/current/weather
6) Stop weather-service
7) Refresh a couple of times to see hystrix in action http://localhost:8000/current/weather

## Hystrix Dashboard
1) Start discovery server
2) Start weather-service
3) Start weather-app
4) Start hystrix-dashboard
5) Go to http://localhost:8000/current/weather and keep refreshing
6) Go to dashboard http://localhost:8080/hystrix
7) Add the URL http://localhost:8000/hystrix.stream
8) Include a Weather title and click monitor stream

## Turbine with Hystrix Dashboard
1) Start discovery server
2) Start weather-service
3) Start weather-app
4) Start gettime-service
5) Start gettime-app
6) Start hystrix-dashboard
7) Go to http://localhost:8000/current/weather and keep refreshing
7) Go to http://localhost:8001/current/get-time and keep refreshing
8) Go to dashboard http://localhost:8080/hystrix
9) Add the URL http://localhost:3000/turbine.stream
10) Include a Weather title and click monitor stream
