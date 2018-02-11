
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
    .when("/register", {templateUrl: "/templates/app/partials/register.html", controller: "PageCtrl"})
    .when("/forgotPassword", {templateUrl: "templates/app/partials/forgotPassword.html", controller: "PageCtrl"})    
    .when("/inactive", {templateUrl: "templates/app/partials/inactive.html", controller: "PageCtrl"})
    .when("/registerSuccess", {templateUrl: "templates/app/partials/registerSuccess.html", controller: "PageCtrl"})
    .when("/pwdresetsuccess", {templateUrl: "templates/app/partials/pwdresetsuccess.html", controller: "PageCtrl"})
    
    .when("/country", {templateUrl: "templates/app/partials/country.html", controller: "PageCtrl"})
    .when("/zipOrZone", {templateUrl: "templates/app/partials/zipOrZone.html", controller: "PageCtrl"})
    .when("/landType", {templateUrl: "templates/app/partials/landType.html", controller: "PageCtrl"})
    .when("/height", {templateUrl: "templates/app/partials/height.html", controller: "PageCtrl"})
    .when("/roofTileMfrSubmit", {templateUrl: "templates/app/partials/roofTileMfrSubmit.html", controller: "PageCtrl"})
    .when("/roofTile", {templateUrl: "templates/app/partials/roofTile.html", controller: "PageCtrl"})
    .when("/roofTileCovering", {templateUrl: "templates/app/partials/roofTileCovering.html", controller: "PageCtrl"})
    .when("/batten", {templateUrl: "templates/app/partials/batten.html", controller: "PageCtrl"})
    .when("/roofType", {templateUrl: "templates/app/partials/roofType.html", controller: "PageCtrl"})
    .when("/buildingDim", {templateUrl: "templates/app/partials/buildingDim.html", controller: "PageCtrl"})
    .when("/tAndC", {templateUrl: "templates/app/partials/tAndC.html", controller: "PageCtrl"})
    
    .when("/error", {templateUrl: "templates/app/partials/error.html", controller: "PageCtrl"})        
    .when("/about", {templateUrl: "templates/app/partials/about.html", controller: "PageCtrl"})
    .when("/faq", {templateUrl: "templates/app/partials/faq.html", controller: "PageCtrl"})    
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
	
	$scope.submitRegistrationForm = function() {
		console.log("submit data")
		dataObj = {
			"userName" : $scope.student.userName,
			"password" : $scope.student.password,
			"active" : $scope.student.active,
			"activationCode" : $scope.student.activationCode,
			"title" : $scope.student.title,
			"surName" : $scope.student.surName,
			"firstName" : $scope.student.firstName,
			"occupation" : $scope.student.occupation,
			"company" : $scope.student.company,
			"road" : $scope.student.road,
			"postCode" : $scope.student.postCode,
			"place" : $scope.student.place,
			"country" : $scope.student.country,
			"phone" : $scope.student.phone,
			"fax" : $scope.student.fax,
			"language" : $scope.student.language,
			"email" : $scope.student.email,
			"emailConf" : $scope.student.emailConf,
			"passwordConf" : $scope.student.passwordConf
		}
		$http({
			method : 'POST',
			url : '/register',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}
	
	$scope.resetPasswordForm = function() {
		console.log("Reset Password")
		dataObj = {
			"userName" : $scope.student.userName			
		}
		$http({
			method : 'POST',
			url : '/forgotPassword',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}
	
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
			console.log(response);
			//Change this as per response
			$location.url("/"+response);
		});
	}
	
	$scope.countrySubmitForm = function() {
		console.log("Submit Country")
		dataObj = {
			"country" : $scope.student.country			
		}
		$http({
			method : 'POST',
			url : '/countrySubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}
	
	$scope.zipOrZoneSubmitForm = function() {
		console.log("Submit zip or zone")
		dataObj = {
			"zipcode" : $scope.student.zipcode,
			"windZone" : $scope.student.windZone
		}
		$http({
			method : 'POST',
			url : '/zipOrZoneSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}
	
	$scope.landTypeSubmitForm = function() {
		console.log("Submit land Type")
		dataObj = {
			"landType" : $scope.student.landType
		}
		$http({
			method : 'POST',
			url : '/landTypeSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}
	
	$scope.heightSubmitForm = function() {
		console.log("Submit height")
		dataObj = {
			"height" : $scope.student.height
		}
		$http({
			method : 'POST',
			url : '/heightSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}

	$scope.roofTileMfrSubmitForm = function() {
		console.log("Submit roofMfrTile")
		dataObj = {
			"roofTileMfr" : $scope.student.manufacturer			
		}
		$http({
			method : 'POST',
			url : '/roofTileMfrSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}

	$scope.roofTileSubmitForm = function() {
		console.log("Submit roofTile")
		dataObj = {
			"roofTile" : $scope.student.roofTile
		}
		$http({
			method : 'POST',
			url : '/roofTileSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}
	
	$scope.coveringSubmitForm = function() {
		console.log("Submit covering")
		dataObj = {
			"length" : $scope.student.length,
			"width" : $scope.student.width,
			"noOfTile" : $scope.student.noOfTile
		}
		$http({
			method : 'POST',
			url : '/roofTileCoveringSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}
	
	$scope.battenSubmitForm = function() {
		console.log("Submit batten")
		dataObj = {
			"batten" : $scope.student.batten
		}
		$http({
			method : 'POST',
			url : '/battenSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(response) {
			console.log(response);
			$location.url("/"+response);
		});
	}

	$scope.roofTypeSubmitForm = function() {
		console.log("Submit roofType")
		dataObj = {
			"roofType" : $scope.student.roofType
		}
		$http({
			method : 'POST',
			url : '/roofTypeSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(data) {
			console.log(response);
			$location.url("/"+response);
		});
	}
	
	$scope.buildingDimSubmitForm = function() {
		console.log("Submit buildingDim")
		dataObj = {
			"buildingHeight" : $scope.student.height,
			"pitch" : $scope.student.pitch,
			"sizeA" : $scope.student.sizeA,
			"sizeB" : $scope.student.sizeB,
			"substrate":$scope.student.substrate
		}
		$http({
			method : 'POST',
			url : '/buildingDimSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(data) {
			console.log(response);
			$location.url("/"+response);
		});
	}

	$scope.tAndCSubmitForm = function() {
		console.log("Submit tAndC")
		dataObj = {
			"agree" : $scope.student.agree,			
		}
		$http({
			method : 'POST',
			url : '/tAndCSubmit',
			data : dataObj,
			headers : {
				'Content-Type' : 'application/json'
			}
		}).success(function(data) {
			console.log(response);
			$location.url("/"+response);
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
