angular.module('bioskopApp.BioskopService', [])
    .factory('BioskopService', function($http){
        var factory = {};
        
        factory.findAll = function() {
			return $http.get('/bioskop-service/bioskop/');	
		}
        
        
        factory.obrisiBioskop = function(id){
			return $http.delete('/bioskop-service/bioskop/'+id);	
		}
		
		factory.izmeniBioskop = function(bioskop){
			return $http.put('/bioskop-service/bioskop/'+bioskop.id, bioskop);	
		}
		

        return factory;
    });