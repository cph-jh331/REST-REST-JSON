# REST-REST-JSON
REST and JSON examprep
### Elaborate on some of the characteristics of REST, like: Stateless, Cacheable, Layered System, Uniform Interface etc.
Serveren er ligeglade med hvad staten er på clientsiden = stateless. Cacheable, man kan gemme dataen lokalt uden om serveren. Layered System = Serveren smider bare data, den skal ikke bekymre sig om, hvordan frontenden præsenterer dataen. Uniform Interface = GET, PUT, POST, DELETE.
### Explain about the topics Same Origin Policy and CORS and why/how they are relevant when calling REST services from an Ajax-call within a browser.
AJAX = async js og XML. Gør det muligt at hente og sende data uden at udseendet på siden ændres, hvilket gør det muligt at skabe SPAs.<br>
CORS = Cross Origin Resource Sharing. AJAX requests, som fx fetch, er det standard at det er forbudt at lave andet end same-origin requests. For at komme uden om dette, så skal serveren sende en header tilbage, hvor den decideret siger, at det okay for enten alle eller lige præcis dette origin er tilladt at hente dataen. ACAO = Access-Control-Allow-Origin. * = wildcard. Alle har mulighed for at bruge dette api.
### Explain the benefit(s) from having a backend that exposes all data to clients via a REST-API
At det gør det muligt at bruge dataen med en masse forskellige frontends, uden at skulle redesigne backend for hvert enkelt frontend.
### Elaborate on how JSON or XML supports communication between subsystems, even when the subsystems are implemented on different platforms. 
Det gør det muligt for alle bruge dataen.
