
var app = angular.module('blog', [ ]);

app.controller('HomeController', ['$scope', '$http', function($scope, $http) {
  $scope.helloWorld = 'Java Web Applications!';

  $scope.cars = [];
  $scope.clients = [];
  $scope.products = [];
  
  $scope.keys = [];

  $scope.car = {};
  $scope.client = {};
  $scope.product = {};
  
  $scope.editProduct = {};
  $scope.editCar = {};
  $scope.editClient = {};
  
  //get car
  $http.get('http://localhost:8080/car').then(
    function successCallback(response) {

    $scope.cars = response;
    $scope.keys = Object.keys(response.data[0]);
  });
  
  //get client
    $http.get('http://localhost:8080/client').then(
    function successCallback(response) {

    $scope.clients = response;
    $scope.keys = Object.keys(response.data[0]);
  });
  
  //get product
  $http.get('http://localhost:8080/product').then(
    function successCallback(response) {

    $scope.products = response;
    $scope.keys = Object.keys(response.data[0]);
  });
  
  //delete car
   $scope.deleteCar = function(id) {
    $http.delete('http://localhost:8080/car' + id)
    .then(
      function successCallback(response) {
        /* code goes here */
		console.log("Succesfully Deleted Car");
      },
      function errorCallback(response) {
        angular.element('[data-id=' + id + ']').remove();
    });
  };
  
  //delete client
   $scope.deleteClient = function(id) {
    $http.delete('http://localhost:8080/client' + id)
    .then(
      function successCallback(response) {
        /* code goes here */
		console.log("Succesfully Deleted Client");
      },
      function errorCallback(response) {
        angular.element('[data-id=' + id + ']').remove();
    });
  };
  
  //delete product
     $scope.deleteProduct = function(id) {
    $http.delete('http://localhost:8080/product' + id)
    .then(
      function successCallback(response) {
        /* code goes here */
		console.log("Succesfully Deleted Product");
      },
      function errorCallback(response) {
        angular.element('[data-id=' + id + ']').remove();
    });
  };
  
  //Add car
    $scope.addCar = function(car) {
    $scope.cars.data.push(car);
	var url ="http://localhost:8080/car";
	$http.post(url+"?"+"&id="+car.id+"&brand="+car.brand+"&serialNumber="+car.serialNumber+"&year="+car.year);
 
    $scope.car = {};
  };
  //add client
  $scope.addClient = function(client) {
    $scope.clients.data.push(client);
	var url ="http://localhost:8080/client";
	$http.post(url+"?"+"&id="+client.id+"&name="+client.name+"&clientCode="+client.clientCode+"&billingCode="+client.billingCode);
 
    $scope.client = {};
  };
  //add product
  $scope.addProduct = function(product) {
    $scope.products.data.push(product);
	var url ="http://localhost:8080/product";
	$http.post(url+"?"+"&id="+product.id+"&name="+product.name+"&quantity="+product.quantity);
 
    $scope.product = {};
  };
  
  
	
  
  
}]);