# language: pt
	# encoding: utf-8

	Funcionalidade: validando formulario tricentis

	Cenário: Preencher o formulario 
	
    Dado que o usuario esta no site da tricentis
    E esta na aba enter vehicle data
    E seleciona a make
    E seleciona o model
    E digita a cylinder capacity
    E digita o engine performance
    E insire a date of manufacture
    E seleciona o number of seats
    E seleciona o right hand drive
    E seleciona novamente number of seats
    E seleciona o fuel type 
    E digita a payload
    E digita o total weight 
    E digita o list price 
    E digita o license plate number
    E digita o annual mileage 
    E clica em next insurant
    Entao deve ir para a aba seguinte insurant
  
    E esta na aba enter insurant data
		E digita o first name
    E digita o last name
    E insire a date of birth
    E seleciona o gender
    E digita o street address
    E seleciona a country
    E digita o zip code
    E digita a city
    E seleciona a occupation
    E seleciona os hobbies
    E digita o website
    E digita o local da picture
    E clica em next product
    Entao deve ir para a aba seguinte product

  	E esta na aba enter product data
    E seleciona a start date
    E seleciona a insurance sum
    E seleciona a merit rating
    E seleciona a damage insurance 
    E seleciona o optional products 
    E seleciona a courtesy car
    E clica em next price
    Entao deve ir para a aba seguinte price
  
  	E esta na aba select price option
    E seleciona um item option
    E clica em next send
    Entao deve ir para a aba seguinte send

  	E esta na aba send quote
    E preenche o e-mail
    E digita o phone 
    E digita o username
    E digita a password
    E digita a confirm password 
    E digita em comments 
    E pressiona Send
    Entao Verifico a mensagem "Sending e-mail success!"