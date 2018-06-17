var app = angular.module('home', []);


app.controller('first', function($scope,$http) {
    $scope.amount = 0;

    $scope.randomNumbers = function () {
        $http.get('/random/'+$scope.amount)
            .then(function successCallback(data) {
            $scope.numbers = data.data['numbers'];
        });
    }
});

app.controller('second', function($scope,$http) {

    $scope.averange = function () {
        var p = document.getElementsByClassName("number");
        var list = [];
        var data = {};
        for(var i =0;i<p.length;i++){
            list.push(p[i].innerHTML);
        }
        data['numbers'] = list;

        $http.post("/averange/",JSON.stringify(data)).then(function (value) {
            $scope.number = value.data['averange'];
        })
    }
});