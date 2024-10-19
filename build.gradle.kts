plugins {
	java
	id("org.springframework.boot") version "3.2.4"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "vn.hoidanit"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator") # check hệ thống có sống hay không
	implementation("org.springframework.boot:spring-boot-starter-data-jpa") #kết nối database
	implementation("org.springframework.boot:spring-boot-starter-security") # login phân quyền người dùng
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf") # chức năng gửi email
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web") #chạy web sever
	implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6") #chức năng gửi email
	developmentOnly("org.springframework.boot:spring-boot-devtools") #mỗi 1 lần ấn lưu thì tự reset
	runtimeOnly("com.mysql:mysql-connector-j") # chạy database mysql trong ứng dụng
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
