import React from "react";
import "../styles/CourcesCard.css";
import { Link } from "react-router-dom";


export default function CourcesCard() {
  <>

  </>
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
        <h5 id="courses-main">Courses</h5>
      </div>
      <div className="courses">
        
        <div className="card" style={{ width: "18rem" }}>
          <img
            src="https://via.placeholder.com/150"
            className="card-img-top"
            alt="Placeholder"
          />
          <div className="card-body">
            <h5 className="card-title">Java Script</h5>
            <p className="card-text">
              Some quick example text to build on the card title and make up the
              bulk of the card's content.
            </p>
           <Link to="/register">
           Go somewhere</Link>
           
          </div>
        </div>
        <div className="card" style={{ width: "18rem" }}>
          <img
            src="https://via.placeholder.com/150"
            className="card-img-top"
            alt="Placeholder"
          />
          <div className="card-body">
            <h5 className="card-title">Java Script</h5>
            <p className="card-text">
              Some quick example text to build on the card title and make up the
              bulk of the card's content.
            </p>
            <Link to="/register">
           Go somewhere</Link>
          </div>
        </div>
        <div className="card" style={{ width: "18rem" }}>
          <img
            src="https://via.placeholder.com/150"
            className="card-img-top"
            alt="Placeholder"
          />
          <div className="card-body">
            <h5 className="card-title">Java Script</h5>
            <p className="card-text">
              Some quick example text to build on the card title and make up the
              bulk of the card's content.
            </p>
            <Link to="/register">
            Go somewhere</Link>
          </div>
        </div>
        <div className="card" style={{ width: "18rem" }}>
          <img
            src="https://via.placeholder.com/150"
            className="card-img-top"
            alt="Placeholder"
          />
          <div className="card-body">
            <h5 className="card-title">Java Script</h5>
            <p className="card-text">
              Some quick example text to build on the card title and make up the
              bulk of the card's content.
            </p>
            <Link to="/register">
           Go somewhere</Link>
          </div>
        </div>
        <div className="card" style={{ width: "18rem" }}>
          <img
            src="https://via.placeholder.com/150"
            className="card-img-top"
            alt="Placeholder"
          />
          <div className="card-body">
            <h5 className="card-title">Java Script</h5>
            <p className="card-text">
              Some quick example text to build on the card title and make up the
              bulk of the card's content.
            </p>
            <Link to="/register">
           Go somewhere</Link>
          </div>
        </div>
        <div className="card" style={{ width: "18rem" }}>
          <img
            src="https://via.placeholder.com/150"
            className="card-img-top"
            alt="Placeholder"
          />
          <div className="card-body">
            <h5 className="card-title">Java Script</h5>
            <p className="card-text">
              Some quick example text to build on the card title and make up the
              bulk of the card's content.
            </p>
            <Link to="/register">
           Go somewhere</Link>
          </div>
        </div>
        <div className="card" style={{ width: "18rem" }}>
          <img
            src="https://via.placeholder.com/150"
            className="card-img-top"
            alt="Placeholder"
          />
          <div className="card-body">
            <h5 className="card-title">Java Script</h5>
            <p className="card-text">
              Some quick example text to build on the card title and make up the
              bulk of the card's content.
            </p>
            <Link to="/register">
            Go somewhere</Link>
          </div>
        </div>
        <div className="card" style={{ width: "18rem" }}>
          <img
            src="https://via.placeholder.com/150"
            className="card-img-top"
            alt="Placeholder"
          />
          <div className="card-body">
            <h5 className="card-title">Java Script</h5>
            <p className="card-text">
              Some quick example text to build on the card title and make up the
              bulk of the card's content.
            </p>
            <Link to="/register">
           Go somewhere</Link>
          </div>
          
        </div>
        
      </div>
    </div>
  );
}
