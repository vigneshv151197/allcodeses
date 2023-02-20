Feature:  Shreeram City Union Two wheeler Loan

Scenario: User Checks Eligibility for Two Wheeler Loan 
    Given User Launch  Scuf application
    When User Click Eligibility Tab 
    And User Click Documents Required Tab
    And User Click Interest Rates Tab
    And User Scroll Down to View Two Wheeler Calculator 
    And User Select Amount using slider
    And User Select Interest using slider
    And User Select Loan Tenure Months Using slider
    Then User Clicks Apply Button
    
Scenario: User Apply for TwowheelerLoan   
    Given User Enters Mobile Number
    When User Clicks Get OTP button
    And User enters OTP
    And User clicks Quickstart button
    And User enters Pin Code 
    And User enters PAN Card Number
    And User enters Name
    And User SelectDate Of Birth
    And User enters NumberFather Name
    And User enters Residence Type
    And User enters Age of the Current Stay in Residence
    And User Enters Work Information
    
Scenario: User Selected Vechical Not Available in that Area
    Given User Select HERO MOTOR CORP Vechical
    When User Select X PULSE Model
    Then User Clicks Ok for Not Available Popup
     
Scenario: User Select Available Vechical in that Area
    Given User Select HONDA Vechical
    When User Select X BLADE SINGLE DISCBS6 Model
    And User Clicks Submit Button  
    And User Rate there Experience
    And User Write the Feedback
    Then User click Submit Button 