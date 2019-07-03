# netflix-feign-client

This project implements two main ideas brought by Netflix: Circuit breaker pattern and Feign.

Feign is a Java to HTTP client binder inspired by Retrofit, JAXRS-2.0, and WebSocket. Feign's first goal was reducing the complexity of binding Denominator uniformly to HTTP APIs regardless of ReSTfulness.

# Why Feign?
Feign uses tools like Jersey and CXF to write java clients for ReST or SOAP services. Furthermore, Feign allows you to write your own code on top of http libraries such as Apache HC. Feign connects your code to http APIs with minimal overhead and code via customizable decoders and error handling, which can be written to any text-based http API.

# How Feign works?

Feign works by processing annotations into a templatized request. Arguments are applied to these templates in a straightforward fashion before output. Although Feign is limited to supporting text-based APIs, it dramatically simplifies system aspects such as replaying requests. Furthermore, Feign makes it easy to unit test your conversions knowing this.

# Basics

1- Add these dependencies to pom.xml:

               <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-openfeign</artifactId>
		</dependency>
    
                <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-config</artifactId>
		</dependency>
		
               <dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
		</dependency>
		
                <dependency>
		   <groupId>org.springframework.cloud</groupId>
		   <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
		</dependency>
		
                <dependency>
		   <groupId>org.springframework.cloud</groupId>
		    <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
		</dependency>
    
         <dependencyManagement>
	    <dependencies>
		<dependency>
		   <groupId>org.springframework.cloud</groupId>
		   <artifactId>spring-cloud-dependencies</artifactId>
		   <version>${spring-cloud.version}</version>
		   <type>pom</type>
		   <scope>import</scope>
		</dependency>
	   </dependencies>
	</dependencyManagement>

		
		

