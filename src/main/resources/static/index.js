angular.module('app', []).controller('indexController', function ($scope, $http) {
const baseUrl = 'http://localhost:8099/market/api/v1';

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
        $http.get(baseUrl + '/products/' + page)
            .then(function (response) {
                console.log(response);
                $scope.Products = response.data;
            });
    };




     $scope.getTable();
});