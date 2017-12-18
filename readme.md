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