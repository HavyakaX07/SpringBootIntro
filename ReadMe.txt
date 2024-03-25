Till now we have manually configured the configuration required for the application like web.xml, context.xml and dependancy management etc.
In production level application there is still more configuration need to be set like logging service, server deployment, security, and profiling etc.
In order to only focus on business need and to avoid some configuration stuff we use spring boot application.
It makes everything embedded with spring-boot starter that includes configuration for web application web.xml, 
servlet mapping and dependency are being auto configured using 
in-build springautoconfiguration.jar this will give in built tomcat server, logging service and will configure web.xml, 
so that rest api mapping will happen quickly.

On top of that it will provide in-built error handling page in case of any server-side error.
So in this project set we will be going to see how we can quickly develop the application with spring-boot.

First we will be going to create spring boot project with required dependancy in spring-initializer.io website.
After that extract and import the project into dev environment and create a simple rest api like get all the courses 
If you hit the api end-point /courses then you will get the all the courses in the form of json. This java to json conversion also handled by the spring.
SO these all are the first level overview of the spring-boot.

If any changes made to any classes we need to restart the server. In order to avoid that also we can make use of 
springboot-devtools dependency it will auto restart the service any changes happens. But if any changes on pom it wont pick it up manually restart is required.

Spring-boot also helps to create different profiles to analyze the behaviour in different environment.
We can create seperate configuration(profile) for dev and production and testing.
we can create profile like application-<profileName>.properties like application-dev.properties, application-prod.properties like this.
and to import particular profile to environment we can make use of property like 
profile.active = dev like this.
if same properties are defined in the both places then it will give higher priority to imported profile.
profile enable us to create configuration depending on environment.

We can create custome configuration properties like data-base configuration and can import these properties to the java centralized class(LoadConfigurationProperty).
So that we can make use of that as bean and can inject where-ever it is needed.

One more interesting feature of spring-boot is the monitoring the matrix of performance of the application and gathering information about them.
This can be done by actuators. This will give api end-point /actuators and will give different information on them.
In order to do so just add one dependency called actuators in the pom.

By default it wont give all the matrix. It will only give selective information.
In order to list all the matrix one can use property 
management.endpoint.web.exposure.include=*
and also one can selectively include only somee of the proprty by giving comma seperated values.
like management.endpoint.web.exposure.include=health,matrixs