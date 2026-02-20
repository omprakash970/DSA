import json 
def lambda_handler(event, content): 
    print("Lambda received: ", event)
    final_result= {
        "message": "Hello from Lambda 1",
        "value": event.get("value", 0)+10
    }
    return final_result