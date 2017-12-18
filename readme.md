# Mockito Demo

## Mockito Concepts

- Methods under test often leverage dependencies.
- Testing with dependencies creates challenges.
    - Live database needed (what happens when the database is down?)
    - Multiple developers testing simultaneously (What happens when there are conflicts?)
    - Incomplete dependency implementation.
    
- Mocking frameworks give you control

### Mocking Options

- Implement the mocked functionality in a class.
    - This approach is tedious and obscure.
    
- Leverage a mocking framework
    - Avoid class creation
    - Leverages the proxy pattern
    
- Multiple options
    - Mockito
    - EasyMock
    - JMock
    
## Mockito Overview

<p align="center">
    <img src="https://user-images.githubusercontent.com/29547780/34085902-c5fc0172-e38e-11e7-85fc-446c7bcbcb44.png"></img>
</p>

Mockito provides classes and capabilities that help support the four stages of the unit testing cycle. 
This mostly focuses on the first three: Setup, execution, and verification. 

### Setup Phase

During the setup phase you use the framework to create mocks and declare how the dependencies should behave when called 
during execution of the method-under-test. 

### Execution Phase

Then during execution the mocks go into a mode that responds to requests made by the method-under-test. 
The mocks will react to specific sets of parameters to control the behavior of the interaction and any result returned. 

### Verification Phase

Then during verification the framework provides capabilities to ensure mocks were interacted with in the manner you intended. 
The most core operations center around the Mockito class and a set of static methods it provides. 

During setup, you will 
use the Mockito mock method to create a mock of the dependency. You then use the Mockito API further to declare what 
to do when the mocked operation is invoked. This is called method stubbing. It follows a when/then pattern. You specify 
how the operation should behave when it is called with a specific set of parameter values. You don't need to do anything 
special during the execution phase. The method-under-test simply uses the mock because it was injected as a member or 
passed through as a parameter. During verification, you use the Mockito verify method to assert that particular methods 
were called with a matched set of inputs. We will now go through a basic demonstration.