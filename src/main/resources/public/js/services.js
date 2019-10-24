angular.module('app.services', []).factory('Character', function($resource) {
  return $resource('/api/v1/characters/:id', { id: '@id' }, {
    update: {
      method: 'PUT'
    }
  });
}).service('popupService',function($window){
    this.showPopup=function(message){
        return $window.confirm(message);
    }
}).service('diceRollService', function(min, max) {
    return Math.random() * (max - min) + min;
});
