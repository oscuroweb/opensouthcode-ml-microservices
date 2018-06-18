# Integrando microservicios y Machine Learning

Ejemplo de como integrar problemas de machine learning con arquitecturas de microservicios con Apache Spark y Spring boot. Puedes ver la presentación utilizada en el Opensouthcode 2018 [aquí] (https://www.slideshare.net/oscuroweb/integrando-machine-learning-y-microservicios)

## Directorio

- [income-predictor-data](https://github.com/oscuroweb/opensouthcode-ml-microservices/tree/master/income-predictor-data/input-data): Datos de entrada para el modelo
- [income-predictor-dto](https://github.com/oscuroweb/opensouthcode-ml-microservices/tree/master/income-predictor-dto): Projecto con los Data Transfer Object
- [income-predictor-ml](https://github.com/oscuroweb/opensouthcode-ml-microservices/tree/master/income-predictor-ml): Servicio spring boot donde se entrena al modelo predictivo a través de Apache Spark
- [income-predictor-service](https://github.com/oscuroweb/opensouthcode-ml-microservices/tree/master/income-predictor-service): Servicio que realiza la predicción para una nueva entrada
- [income-predictor-vaadin](https://github.com/oscuroweb/opensouthcode-ml-microservices/tree/master/income-predictor-vaadin): Aplicación Web basada en Vaadin para realizar predicciones
- [income-predictor-orchestration](https://github.com/oscuroweb/opensouthcode-ml-microservices/tree/master/income-predictor-orchestration): Docker compose

## Datos

Los datos utilizados para el modelo tratan de predecir si los ingresos anuales de una persona exceden de $50K/año en base a los datos del censo. Puedes encontrar más información [aquí](https://archive.ics.uci.edu/ml/datasets/Adult)

## Cómo ejecutarlo

### Crear imágenes Docker

Para crear las imágenes docker se utilizará el plugin de maven [fabric8](http://dmp.fabric8.io/)

```
$ cd ${WORKSPACE}/income-predictor-ml
$ mvn clean package

$ cd ${WORKSPACE}/income-predictor-service
$ mvn clean package

$ cd ${WORKSPACE}/income-predictor-vaadin
$ mvn clean package
```

### Levantar contenedores docker

Para ejecutarlo a través de docker es necesario establecer la variable de entorno ```LOCAL_PATH``` para que apunte al directorio donde se encuentra el dataset de entrada y se almacenará la información de los modelos extraidos.

- En Linux/Mac
```
$ export LOCAL_PATH=${WORKSPACE}/income-predictor-data
```

- En Windows
```
$ set LOCAL_PATH=${WORKSPACE}/income-predictor-data
```

Utilizar docker-compose para levantar los contenedores.
```
$ cd ${WORKSPACE}/income-predictor-orchestration
$ docker-compose up
```

Si todo ha ido bien, habrá 3 contenedores ejecutándose y podrás entrar a la aplicación en la ruta (localhost:8080)[http://localhost:8080/]

## Información sobre el Opensouthcode

Opensouthcode es un evento para promocionar y dar a conocer las tecnologías abiertas: software/hardware libre y opensource. El evento se realiza en Málaga y va por su 3ª edición. Puedes encontrar información del evento [aquí](https://www.opensouthcode.org/conferences/opensouthcode2018)


