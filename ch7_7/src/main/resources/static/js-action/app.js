/**
 * 
 */

var actionApp = angular.module('actionApp',['ngRoute']);




actionApp.config(['$routeProvider' , function($routeProvider) {
	
	$routeProvider.when('/oper', { 
		controller: 'View1Controller', 
		templateUrl: 'views/view1.html', 
	}).when('/directive', {
		controller: 'View2Controller',
		templateUrl: 'views/view2.html',
	});

}]);
