Feature: Validating Place API's

Scenario: Verify if the place is being  successfully  added  using AddPlaceAPI

Given  Add Place Payload
When user calls "AddplaceAPI" with the Post http request
Then the API call got  success with the status code 200
And "status" in response body is "OK" 