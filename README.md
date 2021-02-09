## DesignAndCuality: MasterMind - Author: Cristofer López Cabañas

#### 1. DomainModel
    * First version of mastermind game with basic functionalities.
    * Views with logic
       
#### 2. DocumentView
    * Implemented models separately with views
   
#### 3. dv.withFactoryMethod
    * Added factory method pattern to launch the app with different implemented views
    
#### 4. dv.withDoubleDispatching
    * Added controllers for the different use cases
    * Added facade pattern to encapsulate the logic of the application
    * Added inversion dependencies from controllers to views with visit method
    
#### 5. dv.withComposite
    * Added menu class for showing the user different options to interact with the models from the views
    * Added command pattern to distinguish between different play, undo or redo actions
    * Added session to encapsulate game and state for the controllers
    * Added memento pattern to have a registry of states of the game
    * Added composite pattern of proposal, undo, redo controllers in play Controller
    
#### 6. dv.withProxy
    * Added proxy pattern to use stand alone mode or client/server mode
