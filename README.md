# LoadBalancer
* (1)This project implements a simple load balancing program written in Java, with a Client and a Server program demonstrating its functionality. The functionality is as below:
* All clients connect to the Load Balancer, which is a single entry point for all requests. The requests consist of a string- an ID- the data corresponding to which is to be obtained from Workers and displayed on terminal.
* The Load Balancer accepts requests from clients and redirects them to appropriate workers selected using Round-Robin or Least-Connections scheduling, whichever is specifed by user via command-line.
* The Workers(Servers) extract information corresponding to recieved requests(IDs) from a MySQL Database, and return the data in the form of JSON responses to the Load Balancer, which forwards it to the clients as mentioned above.
* The Client, Load Balancer and Workers are all Multithreaded, and hence capable of Sending/Serving multiple requests at once.
* (2)--
* (3)We challanged with Socket programming approach.
* (4)Not tested yet.
* (5)If using a WIN OS you can use JAVA complier to run. 


 
