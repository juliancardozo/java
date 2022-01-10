package com.example.javarepository.ioc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MainIOC {

	public static void main(String[] args) {

		/**
		//Probando contenedores de IoC
		//Hay dos tipos de contenedores de IoC:

			BeanFactory : 	la interfaz BeanFactory está disponible en el paquete org.springframework.beans .
							Es la interfaz raíz para acceder al contenedor de beans Spring.
							También proporciona técnicas de configuración básicas para administrar los objetos bean
							de cualquier tipo. Podemos decir que BeanFactory es un método heredado para usar.

			1 -
			Resource resource = new FileSystemResource("beanfactory.xml");
			XmlBeanFactory fact = new XmlBeanFactory(resource);

			2 -
			ClassPathResource resource = new ClassPathResource("beanfactory.xml");
			XmlBeanFactory fact = new XmlBeanFactory(resource);


			ApplicationContext: la interfaz ApplicationContext está disponible en el paquete org.springframework.context.
								Es un superconjunto completo de una interfaz BeanFactory.
								También se conoce como una interfaz central que proporciona la configuración
								a una aplicación.

			1 -
			ClassPathXmlApplicationContext  applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

			2 -
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


		 * Como hemos comentado anteriormente, tanto ApplicationContext como BeanFactory son las interfaces de Java y
		 * ambos son los tipos de contenedor de IoC.
		 * Pero la principal diferencia entre ambas interfaces es que BeanFactory proporciona las funciones básicas de
		 * IoC y DI, mientras que ApplicationContext ofrece las funciones avanzadas.
		 *
		 * Algunas de otras diferencias se dan a continuación:
		 *
		 * La interfaz de BeanFactory no admite la internacionalización (i18n), mientras que ApplicationContext la brinda.
		 * La internacionalización es el proceso de construir una aplicación de tal manera que cualquier idioma pueda
		 * adaptarla sin modificaciones.
		 * La interfaz BeanFactory usa una técnica de inicialización perezosa , mientras que ApplicationContext usa una
		 * inicialización ansiosa , es decir, BeanFactory crea solo un bean singleton cuando se solicita, pero
		 * ApplicationContext produce todos los beans singleton en el momento de la inicialización.
		 * BeanFactory no admite la configuración basada en anotaciones, mientras que ApplicationContext admite
		 * anotaciones como @ Autowired , @ ComponentScan , etc.
		 *
		 * */

			//create a Spring container
			ClassPathXmlApplicationContext applicationContext = new	ClassPathXmlApplicationContext("applicationContext.xml");
			System.out.println("config is loaded");
			//retrieving bean from the Spring container
			Sim sim = applicationContext.getBean("simID", Sim.class);
			sim.call();
			sim.message();
			sim.dataUsage();
		}

}
