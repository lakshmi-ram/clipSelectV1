
/**
 * Main AngularJS Web Application
 */
var app = angular.module('tutorialWebApp', [
  'ngRoute'
]);

/**
 * Configure the Routes
 */
app.config(['$routeProvider', function ($routeProvider) {
  $routeProvider
    // Home
    .when("/", {templateUrl: "/templates/app/partials/login.html", controller: "PageCtrl"})    
    // Pages
    .when("/about", {templateUrl: "templates/app/partials/about.html", controller: "PageCtrl"})
    .when("/faq", {templateUrl: "templates/app/partials/faq.html", controller: "PageCtrl"})
    .when("/register", {templateUrl: "/templates/app/partials/register.html", controller: "PageCtrl"})
    .when("/forgotPassword", {templateUrl: "templates/app/partials/forgotPassword.html", controller: "PageCtrl"})
    .when("/active", {templateUrl: "templates/app/partials/active.html", controller: "PageCtrl"})
    .when("/inactive", {templateUrl: "templates/app/partials/inactive.html", controller: "PageCtrl"})
    .when("/pricing", {templateUrl: "templates/app/partials/pricing.html", controller: "PageCtrl"})
    .when("/services", {templateUrl: "templates/app/partials/services.html", controller: "PageCtrl"})
    .when("/contact", {templateUrl: "templates/app/partials/contact.html", controller: "PageCtrl"})
    // Blog
    .when("/blog", {templateUrl: "templates/app/partials/blog.html", controller: "BlogCtrl"})
    .when("/blog/post", {templateUrl: "templates/app/partials/blog_item.html", controller: "BlogCtrl"})
    // else 404
    .otherwise("/404", {templateUrl: "templates/app/partials/404.html", controller: "PageCtrl"});
}]);

/**
 * Controls the Blog
 */
app.controller('BlogCtrl', function (/* $scope, $location, $http */) {
  console.log("Blog Controller reporting for duty.");
});

/**
 * Controls all other Pages
 */
app.controller('PageCtrl', function($scope, $location, $http, $location) {
	console.log("Page Controller reporting for duty.");

	$scope.submitLoginForm = function() {
		console.log("Login data")
		dataObj = {
			"userName" : $scope.student.userName,
			"password" : $scope.student.password
		}
		$http({
			method : 'POST',
			url : '/loginSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response)
			//CHange this as per response
			$location.url("/"+response);
		});
	}
	
	$scope.submitStudnetForm = function() {
		console.log("submit data")
		dataObj = {
			"name" : $scope.student.firstName
		}
		$http({
			method : 'POST',
			url : 'http://example.com/clone.php',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/x-www-form-urlencoded'
			}
		}).success(function(data) {
			alert("Thanks for Registering.");
		});
	}
	
	$scope.resetPasswordForm = function() {
		console.log("Reset Password")
		dataObj = {
			"email" : $scope.student.emaild			
		}
		$http({
			method : 'POST',
			url : 'http://example.com/clone.php',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/x-www-form-urlencoded'
			}
		}).success(function(data) {
			alert("Reset pwd");
		});
	}
	
	// Activates the Carousel
	$('.carousel').carousel({
		interval : 5000
	});

	// Activates Tooltips for Social Links
	$('.tooltip-social').tooltip({
		selector : "a[data-toggle=tooltip]"
	})
});
