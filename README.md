# Websocket Push notification (angular and  spring boot)
## Frontend:

```` 
ng serve
```` 
## Backend:
```` 
mvn spring:boot:run
```` 

### For Fronend

```ng new websocket-frontend
cd websocket-frontend
ng add @angular/material
```` 


Install

```
npm i --save sockjs-client stompjs net
```` 
Then

```
npm i --save-dev @types/sockjs-client @types.stompjs
```` 
Import using

```
import _ as SockJS from 'sockjs-client'; import _ as Stomp from 'stompjs';
```` 

To solve the issue with 'global' I had to add the following to index.html


````
<script type="application/javascript"> var global = window; </script>
```` 


