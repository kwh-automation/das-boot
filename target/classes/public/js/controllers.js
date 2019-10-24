angular.module('app.controllers', []).controller('CharacterListController', function($scope, $state, popupService, $window, Character) {
  $scope.character = Character.query();

  $scope.deleteCharacter = function(character) { 
    if (popupService.showPopup('Really delete this?')) {
      character.$delete(function() {
        $scope.character = Character.query();
        $state.go('characters');
      });
    }
  };
// controller appears to be calling 'Character' service to 'get' the character from the specified view
}).controller('ViewCharacterController', function($scope, $stateParams, Character) {
  $scope.character = Character.get({ id: $stateParams.id });

}).controller('CreateCharacterController', function($scope, $state, popupService, $stateParams, Character) {
  $scope.character = new Character();
  $scope.addCharacter = function() { //create a new character. Issues a POST to /api/v1/characters
    if (popupService.showPopup('Save character?')) {
      $scope.character.$save(function () {
        $state.go('characters'); // on success go back to the list i.e. characters state.
      });
    }
  };

}).controller('EditCharacterController', function($scope, $state, $stateParams, Character) {
  $scope.updateCharacter = function() { //Update the edited character. Issues a PUT to /api/v1/characters/:id
    $scope.character.$update(function() {
      $state.go('characters'); // on success go back to the list i.e. characters state.
    });
  };
  $scope.loadCharacter = function() { //Issues a GET request to /api/v1/characters/:id to get a character to update
    $scope.character = Character.get({ id: $stateParams.id });
  };
  $scope.loadCharacter(); // Load a character which can be edited on UI

}).controller('DiceRollServiceController', function(diceRollService) {
  diceRollService(1, 100);
});
