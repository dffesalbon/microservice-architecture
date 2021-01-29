import Axios from "axios";

const api = Axios.create({
  baseURL: "/app/chat-service/message",
});

const chatAPI = {
  getMessages: (groupId) => {
    console.log("Calling get messages from API");
    console.log(`messages/${groupId}`);
    return api.get(`messages/${groupId}`);
  },

  sendMessage: (username, text) => {
    let msg = {
      sender: username,
      content: text,
    };
    console.log(msg);
    return api.post(`send`, msg);
  },
};

export default chatAPI;
