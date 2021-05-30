angular.module('app', []).controller('basketController', function ($scope, $http) {
    const baseUrl = 'http://localhost:8090/market/api/v1';

    $scope.getBasket = function () {
        $http.get(baseUrl + '/basket')
            .then(function (response) {
                console.log(response);
                $scope.Product = response.data;
            });
    };

    $scope.deleteProductById = function (id) {
        $http.delete(baseUrl + '/basket/' + id)
            .then(function (response) {
                console.log(response);
                $scope.getTable();
            });
    };
     $scope.getBasket()

});