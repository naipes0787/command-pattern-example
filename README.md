# Command pattern use case
___
The project simulates the use of different kinds of remote controllers (Invokers) which can
activate/deactivate some devices (Receivers). In order to do this the remote controllers have commands as attributes.
The invoker has a list of commands (Or a single one command), each command has a reference
to the receiver.
The RemoteControllerWithUndo allow us to undo the last command executed.
