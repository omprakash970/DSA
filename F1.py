import json 
def lambda_handler(event, content): 
    print("Lambda received: ", event)
    final_result= {
        "final_message": "Hello from Lambda!",
        "final_value":event["value"]*2

    }
    return final_result