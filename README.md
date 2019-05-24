# Command pattern use case
___
The project simulates the use of different kinds of remote controllers (Invokers) which can
activate/deactivate some devices (Receivers). In order to do this the remote controllers have a
commands as attributes.

Basic structure:
- The invoker has a list of commands, each command has the reference to a receiver