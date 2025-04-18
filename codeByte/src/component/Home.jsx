import React from "react";
import "../styles/Home.css";

export default function Home() {
  return (
    <div className="home-container">
      <h1>Hello, what do You Want To Learn?</h1>
      <div className="input-group">
        <input
          type="text"
          className="form-control"
          placeholder="Recipient's username"
          aria-label="Recipient's username with two button addons"
        />
        <button className="btn btn-outline-secondary" type="button">
          Button
        </button>
      </div>
      <div className="card">
        <img src="..." className="card-img-top" alt="..." />
        <div className="card-body">
          <h5 className="card-title">Card title</h5>
          <p className="card-text">
            Some quick example text to build on the card title and make up the
            bulk of the card's content.
          </p>
          <a href="#" className="btn btn-primary">
            Go somewhere
          </a>
        </div>
      </div>
    </div>
  );
}
