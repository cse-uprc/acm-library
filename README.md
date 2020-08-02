
# acm-app-library

## Contents
1. Introduction
2. Globals
3. Exceptions
4. PasswordHash
5. Version.properties
6. Developers and Codeowners
## Section 1
### Introduction
This repository contains the source of the library jar for the ACM website back-end.
It includes the global variables, declared as Enums, exceptions, and password hash function required by the back-end microservices.

## Section 2
### Globals
This package contains global variables used for the apps microservices. They are as follows:
  * WebRoles - The permission groups for users. Admin and User. Used to determine access to certain functions.
  * QueryStatements - Statements used to query the database
  * ACM SQL Tags - Tags used to identify fields in the database.
  ## Section 3
  ### Exceptions
  This package contains custom exceptions used by the apps microservices. They are as follows:
   * InvalidParamValueException - Thrown if parameters passed to the SQL services are invalid.
   * NullParamsException - Thrown if parameters passed to the SQL services are null.
   ## Section 4
   ### PasswordHash
   This package contains the hash function for encrypting passwords for server-side verification. This is used to encrypt stored passwords, and to check if two hashed passwords are equal.
   
   ## Section 5
   ### Version.properties
   This file contains the version number of the current release of the app.
   
   ## Section 6
   ### Developers and Codeowners
   
    Josue Van Dyke - josuemvd@gmail.com

    Sam Butler - sambutler1017@icloud.com

    Kiyle Winborne - kiyleawinborne@gmail.com
    
    Luke Lengel - steven.lengel@rockets.utoledo.edu
    
    Seth Hancock - shancoc3@rockets.utoledo.edu
    
    
   
   
