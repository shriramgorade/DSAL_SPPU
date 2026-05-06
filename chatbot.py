import random

# Chatbot details
bot_name = "HelpBot"
weather = "sunny"
mood = "happy"

# Predefined responses
responses = {
    "what's your name?": [
        f"My name is {bot_name}.",
        f"You can call me {bot_name}.",
        f"I am {bot_name}, your assistant."
    ],

    "how are you?": [
        f"I am {mood}.",
        f"Feeling {mood} today!",
        f"I am doing great."
    ],

    "what's today's weather?": [
        f"The weather is {weather}.",
        f"It is {weather} today."
    ],

    "help": [
        "I can answer questions about my name, weather, and greetings."
    ],

    "default": [
        "Sorry, I didn't understand that.",
        "Please ask another question.",
        "Can you rephrase your question?"
    ]
}

# Function to generate response
def get_response(message):
    if message in responses:
        return random.choice(responses[message])
    else:
        return random.choice(responses["default"])

# Function to match user input
def process_input(user_input):
    if "name" in user_input:
        return "what's your name?"
    elif "weather" in user_input:
        return "what's today's weather?"
    elif "how are" in user_input:
        return "how are you?"
    elif "help" in user_input:
        return "help"
    else:
        return "default"

# Main chatbot loop
print("BOT: Hello! What is your name?")
username = input("You: ")
print(f"BOT: Nice to meet you, {username}!")

while True:
    user_message = input("You: ").lower()

    if user_message in ["exit", "stop", "bye"]:
        print("BOT: Goodbye! Have a nice day.")
        break

    matched_question = process_input(user_message)
    reply = get_response(matched_question)

    print("BOT:", reply)
