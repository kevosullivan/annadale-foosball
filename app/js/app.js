'use strict';

/* App Module */

angular.module('tokenserv', ['tokenserv-webFilters']).
  config(['$routeProvider', function($routeProvider) {
  $routeProvider.
      when('/', {templateUrl: 'index.html',   controller: IndexCtrl }).
      otherwise({redirectTo: 'index.html'});
}]);