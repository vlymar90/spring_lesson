angular.module('app', []).controller('indexController', function ($scope, $http) {
const baseUrl = 'http://localhost:8090/market/api/v1';

     $scope.getTable = function () {
        $scope.getPage(0);
     };

     $scope.deleteProductById = function (id) {
         $http.delete(baseUrl + '/products/' + id)
             .then(function (response) {
                 console.log(response);
                 $scope.getTable();
             });
     };

    $scope.getPage = function (page) {
        $http.get(baseUrl + '/products?page=' + page)
            .then(function (response) {
                console.log(response);
                $scope.Products = response.data;
            });
    };

    $scope.addBasket = function (id) {
        $http.get(baseUrl + '/basket/' + id)
            .then(function (response) {
            console.log(response);
        })
    };

    $scope.saveProduct = function () {
        console.log($scope.Product)
        $http.post(baseUrl + '/products', $scope.Product)
            .then(function (resp){
                $scope.Product = null
            })

    };





    $scope.getTable();
});