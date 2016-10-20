/**
 * Created by malin on 19-10-2016.
 */

var app=angular.module("calculate",[]);
app.controller("calculatectrl",function ($scope,$http) {
    $scope.bmi = function () {
        var height=$scope.h;
        var weight=$scope.w;



        var words = $http.get("http://localhost:9090/RESTExample/last/"+height+"/"+weight);
        words.success(function (data) {
            console.log(data);
            $scope.cal={"BMI":data.BMI,"Ideal":data.Ideal,"Status":data.Status};

        });
    }
});
